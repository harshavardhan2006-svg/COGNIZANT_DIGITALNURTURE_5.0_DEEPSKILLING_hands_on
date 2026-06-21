public class Main {

        public static void main(String[] args) {

                Product[] products = {

                                new Product(101, "Camera", "Electronics"),
                                new Product(102, "Laptop", "Electronics"),
                                new Product(103, "Mobile", "Electronics"),
                                new Product(104, "TV", "Electronics"),
                                new Product(105, "Watch", "Accessories")
                };

                System.out.println("Linear Search:");

                Product p1 = LinearSearch.search(products, "Camera");

                if (p1 != null)
                        p1.display();

                System.out.println();

                System.out.println("Binary Search:");

                Product p2 = BinarySearch.search(products, "TV");

                if (p2 != null)
                        p2.display();
        }
}
