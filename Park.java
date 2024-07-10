// 3. Создать класс Парк с внутренним классом, с помощью объектов, которые можно хранить информацию об аттракционах, время их работы и ценность.

public class Park {
    private String attractionName;
    private String workingTime;
    private double cost;
    
    public Park(String attractionName, String workingTime, double cost) {
    this.attractionName = attractionName;
    this.workingTime = workingTime;
    this.cost = cost;
    }
    
    public Park() {
    }

    public void displayAttractionInfo() {
    System.out.println("Attraction Name: " + attractionName);
    System.out.println("Working Time: " + workingTime);
    System.out.println("Cost: " + cost);
    }
    
    public static void main(String[] args) {
    Park.Attraction attraction1 = new Park().new Attraction("Чертово колесо", "10:00 - 20:00", 10.0);
    Park.Attraction attraction2 = new Park().new Attraction("Американские горки", "11:00 - 18:00", 20.0);
    Park.Attraction attraction3 = new Park().new Attraction("Лабиринт", "11:00 - 19:00", 15.0);

    attraction1.displayAttractionInfo();
    attraction2.displayAttractionInfo();
    attraction3.displayAttractionInfo();
    }
    
    public class Attraction {
    private double cost;
    private String workingTime;
    private String attractionName;

    public Attraction(String attractionName, String workingTime, double cost) {
    this.attractionName = attractionName;
    this.workingTime = workingTime;
    this.cost = cost;
    }
    
    public void displayAttractionInfo() {
    System.out.println("Attraction Name: " + attractionName);
    System.out.println("Working Time: " + workingTime);
    System.out.println("Cost: " + cost);
    }
    }
    }
