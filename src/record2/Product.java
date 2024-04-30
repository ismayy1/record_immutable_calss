package record2;

public record Product(String name, double price, boolean isAvailable) {

    // we can't update values, it's read only, final variable
//    public void updateIsAvailable(boolean isAvailable) {
//        this.isAvailable = true;
//    }

}
