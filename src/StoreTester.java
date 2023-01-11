import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StoreTester {

    @Test
    public void testAddBook(){
        Store store = new Store();
        Book book = new Book();
        store.addBook(book);
        assertTrue(true);
    }

    @Test
    public void testAddBookandPhone(){
        Store store = new Store();
        Book book = new Book();
        Phone phone = new Phone();
        store.addBook(book);
        store.addPhone(phone);
        assertTrue(true);
    }

    @Test
    public void testUpdateLocationAndGetAllPhones(){
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();
        Phone phone5 = new Phone();
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addPhone(phone3);
        store.addPhone(phone4);
        store.addPhone(phone5);
        store.updatePhonesLocation("Room 514");
        store.getAllPhones();
        assertEquals(phone1.getLocation(), "Room 514");
        assertEquals(phone2.getLocation(), "Room 514");
        assertEquals(phone3.getLocation(), "Room 514");
        assertEquals(phone4.getLocation(), "Room 514");
        assertEquals(phone5.getLocation(), "Room 514");
    }

    @Test
    public void testGetItems(){
        Store store = new Store();
        Phone phone = new Phone();
        Book book = new Book();
        Arduino arduino = new Arduino();
        Magazine magazine = new Magazine();
        store.addPhone(phone);
        store.addItem(book);
        store.addItem(arduino);
        store.addItem(magazine);
        ArrayList<CISItem> list=new ArrayList<>();
        ArrayList<CISItem> list2=new ArrayList<>();
        ArrayList<CISItem> list3=new ArrayList<>();
        ArrayList<CISItem> list4=new ArrayList<>();
        list.add(phone);
        list2.add(arduino);
        list3.add(magazine);
        list4.add(book);

        assertEquals(list, store.getItems("phone"));
        assertEquals(list2, store.getItems("arduino"));
        assertEquals(list3, store.getItems("magazine"));
        assertEquals(list4, store.getItems("book"));

    }

    @Test
    public void testUpdateItems(){

        Store store = new Store();
        Phone phone = new Phone();
        Book book = new Book();
        Arduino arduino = new Arduino();
        Magazine magazine = new Magazine();
        store.addPhone(phone);
        store.addItem(book);
        store.addItem(arduino);
        store.addItem(magazine);

        store.updateItems("phone", "networkType", "5G");
        store.updateItems("phone", "screenSize", "10");

        store.updateItems("book", "isbn", "978-3-16-148410-0");
        store.updateItems("book", "edition", "5");
        store.updateItems("book", "title", "Textbook");

        store.updateItems("arduino", "version", "5");

        store.updateItems("magazine", "coverStoryTitle", "Magazine Title");
        store.updateItems("magazine", "printDate", "2022 / 3 / 5");

        store.updateItems("magazine", "author", "Edward");

        store.updateItems("arduino", "maker", "Apple");

        store.updateItems("book", "name", "Book name");

        for(CISItem item : store.getItems("phone")){
            assertEquals(((Phone)item).getNetworkType(), "5G");
            assertEquals(((Phone)item).getScreenSize(), 10);
        }
        for(CISItem item : store.getItems("book")){
            assertEquals(((Book)item).getIsbn(), "978-3-16-148410-0");
            assertEquals(((Book)item).getEdition(), "5");
            assertEquals(((Book)item).getTitle(), "Textbook");
            assertEquals((item).getName(), "Book name");
        }
        for(CISItem item : store.getItems("arduino")){
            assertEquals(((Arduino)item).getVersion(), "5");
            assertEquals(((ElectronicItem)item).getMaker(), "Apple");
        }
        for(CISItem item : store.getItems("magazine")){
            assertEquals(((Magazine)item).getCoverStoryTitle(), "Magazine Title");
            assertEquals(((Magazine)item).getPrintDate(), "2022 / 3 / 5");
            assertEquals(((ReadingItem)item).getAuthor(), "Edward");
        }

        System.out.println(store.showAllInfo());

    }

}
