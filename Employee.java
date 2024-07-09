public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    int age;
    int salary;

    public Employee (String fio, String position, String email, String phone, int age, int salary) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("ФИО: "+fio);
        System.out.println("Должность: "+position); 
        System.out.println("Почта: "+email); 
        System.out.println("Телефон: "+phone);
        System.out.println("Возраст: "+age);
        System.out.println("Зарплата: "+salary);
    }
// 2. Создать массив из 5 сотрудников. 
    public static void main (String[] args) {
            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Оксана Дрягина", "Генеральный директор", "od@monster.ru", "+79112222222", 25, 350000);
            persArray[1] = new Employee("Иван Петрушин", "Директор по развитию", "ip@monster.ru", "+79112222223", 42, 420000);
            persArray[2] = new Employee("Юлия Соколова", "Менеджер", "js@monster.ru", "+79112222224", 21, 21000);
            persArray[3] = new Employee("Руслан Вынага", "Ведущий разработчик", "rv@monster.ru", "+79112222225", 28, 28000);
            persArray[4] = new Employee("Екатерина Васильева", "Директор по работе с клиентами", "ev@monster.ru", "+79112222221", 38, 38000);
 // вывод информации о первом объекте в консоль,для примера
            persArray[0].printInfo(); 
        }

}

