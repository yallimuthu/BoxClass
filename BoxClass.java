import java.util.Arrays;

class BoxClass {
    private String box[] = new String[3];
    
    BoxClass() {
        Arrays.fill(box, "");
    }

    void addItem(String itemName) {
        int itemInsertLocation = -1;
        for (int i=0; i<box.length; i++) {
            if (box[i] == "") {
                itemInsertLocation = i;
                break;
            }
        }
        if (itemInsertLocation == -1) {
            System.out.println("Box full. can't add:" + itemName);
        } else {
            box[itemInsertLocation] = itemName;
            System.out.println(
                "Item Inserted - Box" 
                + itemInsertLocation 
                + ":" + itemName );
        }
    }

    void removeItem(String itemName) {
        int itemRemoveLocation = -1;
        for (int i=0; i<box.length; i++) {
            if (box[i] == itemName) {
                itemRemoveLocation = i;
                break;
            }
        }
        if (itemRemoveLocation == -1) {
            System.out.println(itemName + "doesn't exist");
        } else {
            box[itemRemoveLocation] = "";
            System.out.println(
                "Item removed - Box" 
                + itemRemoveLocation 
                + ":" + itemName );
        }
    }

    void printItems() {
        for (int i=0; i<box.length; i++) {
            System.out.println("box " + i + ": " + box[i]);
        }
    }
}

class BoxClassDemo {
    public static void main(String[] args) {
        BoxClass yashBoxClass = new BoxClass();

        yashBoxClass.addItem("rubis cube");
        yashBoxClass.addItem("snacks");
        yashBoxClass.addItem("hat");

        yashBoxClass.printItems();

        yashBoxClass.addItem("hat");

        yashBoxClass.printItems();

        yashBoxClass.removeItem("snacks");
        yashBoxClass.printItems();
        
    }
}