public class Course_Work {

    private static Employee[] employees = new Employee[10];

    public static void printEmp() {
        for (Employee employee : employees)
            System.out.println(employee);
    }

    public static int calcSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee result = employees[0];
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalary() {
        Employee result = employees[0];
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calcAveSalary() {
        return calcSalary() / (float) employees.length;
    }

    public static void fullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {

        employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 110000);
        employees[1] = new Employee("Пертров Федор Федорович", 2, 134000);
        employees[2] = new Employee("Григорьев Григорий Григорьевич", 3, 160200);
        employees[3] = new Employee("Шведков Иван Федорович", 4, 100230);
        employees[4] = new Employee("Носов Леон Романович", 4, 203042);
        employees[5] = new Employee("Козлов Фёдор Тимофеевич", 1, 54341);
        employees[6] = new Employee("Борисова Кристина Михайловна", 2, 223234);
        employees[7] = new Employee("Киселев Дмитрий Артёмович", 1, 100000);
        employees[8] = new Employee("Тарасова Ника Ильинична", 2, 200000);
        employees[9] = new Employee("Назаров Святослав Александрович", 3, 123000);

        System.out.println();
        System.out.println("Список сотрудников:");
        System.out.println();
        printEmp();
        System.out.println("============");
        System.out.println("Затраты на зарплаты в месяц - " + calcSalary());
        System.out.println("============");
        System.out.println("Сотрудник с минимальной зарплатой - " + findMinSalary());
        System.out.println("============");
        System.out.println("Сотрудник с максимальной зарплатой - " + findMaxSalary());
        System.out.println("============");
        System.out.println("Средняя зарплата - " + calcAveSalary());
        System.out.println("============");
        System.out.println("Ф.И.О. всех сотрудников: ");
        System.out.println();
        fullNames();
    }
}

