import java.util.ArrayList;

public class Store {

    ArrayList<CISItem> items;

    public Store(){
        this.items=new ArrayList<>();
    }

    public Store(ArrayList<CISItem> items) {
        this.items = items;
    }

    public void addBook(Book book){
        items.add(book);
    }
    public void addPhone(Phone phone){
        items.add(phone);
    }
    public void addItem(CISItem cisItem){items.add(cisItem);}

    public void updatePhonesLocation(String location){
        for(CISItem item : items){
            if(item instanceof Phone){
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> out = new ArrayList<>();
        for(CISItem item : items){
            if(item instanceof Phone){
                out.add((Phone) item);
            }
        }
        return out;
    }

    public ArrayList<CISItem> getItems(String itemType){

        ArrayList<CISItem> out = new ArrayList<>();
        for(CISItem item : items){
            if(itemType.equalsIgnoreCase("phone") && item instanceof Phone){
                out.add(item);
            }
            else if(itemType.equalsIgnoreCase("magazine") && item instanceof Magazine){
                out.add(item);
            }
            else if(itemType.equalsIgnoreCase("arduino") && item instanceof Arduino){
                out.add(item);
            }
            else if(itemType.equalsIgnoreCase("book") && item instanceof Book){
                out.add(item);
            }
        }
        return out;

    }

    public void updateItems(String itemType, String property, String value){
        if(itemType.equalsIgnoreCase("book")){
            ArrayList<CISItem> books = getItems(itemType);
            switch(property){
                case "isbn":
                    for(CISItem item : books)((Book) item).setIsbn(value);
                    break;
                case "edition":
                    for(CISItem item : books)((Book) item).setEdition(value);
                    break;
                case "title":
                    for(CISItem item : books)((Book) item).setTitle(value);
                    break;
                case "wordCount":
                    for(CISItem item : books)((Book) item).setWordCount(Integer.parseInt(value));
                    break;
                case "datePublished":
                    for(CISItem item : books)((Book) item).setDatePublished(value);
                    break;
                case "author":
                    for(CISItem item : books)((Book) item).setAuthor(value);
                    break;
                case "name":
                    for(CISItem item : books)item.setName(value);
                    break;
                case "location":
                    for(CISItem item : books)item.setLocation(value);
                    break;
                case "price":
                    for(CISItem item : books)item.setPrice(Integer.parseInt(value));
                    break;
                case "description":
                    for(CISItem item : books)item.setDescription(value);
                    break;
            }
        }

        else if(itemType.equalsIgnoreCase("phone")){
            ArrayList<CISItem> phones = getItems(itemType);
            switch(property){
                case "networkType":
                    for(CISItem item : phones)((Phone) item).setNetworkType(value);
                    break;
                case "screenSize":
                    for(CISItem item : phones)((Phone) item).setScreenSize(Integer.parseInt(value));
                    break;
                case "storageCapacity":
                    for(CISItem item : phones)((Phone) item).setStorageCapacity(Integer.parseInt(value));
                    break;
                case "model":
                    for(CISItem item : phones)((Phone) item).setModel(value);
                    break;
                case "maker":
                    for(CISItem item : phones)((Phone) item).setMaker(value);
                    break;
                case "operatingSystem":
                    for(CISItem item : phones)((Phone) item).setOperatingSystem(value);
                    break;
                case "name":
                    for(CISItem item : phones)item.setName(value);
                    break;
                case "location":
                    for(CISItem item : phones)item.setLocation(value);
                    break;
                case "price":
                    for(CISItem item : phones)item.setPrice(Integer.parseInt(value));
                    break;
                case "description":
                    for(CISItem item : phones)item.setDescription(value);
                    break;
            }
        }

        else if(itemType.equalsIgnoreCase("arduino")){
            ArrayList<CISItem> arduinos = getItems(itemType);
            switch(property){
                case "version":
                    for(CISItem item : arduinos)((Arduino) item).setVersion(value);
                    break;
                case "storageCapacity":
                    for(CISItem item : arduinos)((Arduino) item).setStorageCapacity(Integer.parseInt(value));
                    break;
                case "model":
                    for(CISItem item : arduinos)((Arduino) item).setModel(value);
                    break;
                case "maker":
                    for(CISItem item : arduinos)((Arduino) item).setMaker(value);
                    break;
                case "operatingSystem":
                    for(CISItem item : arduinos)((Arduino) item).setOperatingSystem(value);
                    break;
                case "name":
                    for(CISItem item : arduinos)item.setName(value);
                    break;
                case "location":
                    for(CISItem item : arduinos)item.setLocation(value);
                    break;
                case "price":
                    for(CISItem item : arduinos)item.setPrice(Integer.parseInt(value));
                    break;
                case "description":
                    for(CISItem item : arduinos)item.setDescription(value);
                    break;
            }
        }

        else{
            ArrayList<CISItem> magazines = getItems(itemType);
            switch(property){
                case "coverStoryTitle":
                    for(CISItem item : magazines)((Magazine) item).setCoverStoryTitle(value);
                    break;
                case "printDate":
                    for(CISItem item : magazines)((Magazine) item).setPrintDate(value);
                    break;
                case "wordCount":
                    for(CISItem item : magazines)((Magazine) item).setWordCount(Integer.parseInt(value));
                    break;
                case "datePublished":
                    for(CISItem item : magazines)((Magazine) item).setDatePublished(value);
                    break;
                case "author":
                    for(CISItem item : magazines)((Magazine) item).setAuthor(value);
                    break;
                case "name":
                    for(CISItem item : magazines)((Magazine) item).setName(value);
                    break;
                case "location":
                    for(CISItem item : magazines)((Magazine) item).setLocation(value);
                    break;
                case "price":
                    for(CISItem item : magazines)((Magazine) item).setPrice(Integer.parseInt(value));
                    break;
                case "description":
                    for(CISItem item : magazines)((Magazine) item).setDescription(value);
                    break;
            }
        }
    }

    public String showAllInfo(){
        String out = "";
        for(CISItem item: items){
            out+=item.toString()+"\n";
        }
        return out;
    }


}
