public class Repository {
    Product[] products = new Product[0];

    // Добавление товара в массив Product[]
    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    // Получать все сохранённые товары Product[]
    public Product[] getProduct() {
        return products;
    }

    // Удаление по ID
    public void removeById(int id) {
        // Исключение
        Product removeProduct=findById(id);
        if (removeProduct == null) {
            throw new NotFoundException(id);
        }
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
