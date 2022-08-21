public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Константин", "Андреевич", "Хвалёнов", 1, 75_500.73);
        employees[1] = new Employee("Алексей", "Алексеевич", "Голубь", 1, 89_900);
        employees[2] = new Employee("Дмитрий", "Александрович", "Жданов", 2, 42_500);
        employees[3] = new Employee("Елизавета", "Андреевна", "Романова", 2, 78_500.84);
        employees[4] = new Employee("Ольга", "Николаевна", "Кожедуб", 3, 75_000);
        employees[5] = new Employee("Фёдор", "Павлович", "Громов", 3, 70_500);
        employees[6] = new Employee("Татьяна", "Васильевна", "Ворошилова", 4, 65_500);
        employees[7] = new Employee("Павел", "Сергеевич", "Климкин", 4, 94_250);
        employees[8] = new Employee("Николай", "Константинович", "Ульянов", 5, 56_500);
        employees[9] = new Employee("Александра", "Вячеславовна", "Палестинова", 5, 73_500.23);
        printAllEmployee();
    }
    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма затрат на выплаты в месяц составляет: " + getSalarySum() + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeMaxSalary());
        System.out.println("Средняя заработная плата составляет: " + getAverageValue() + " рублей");
        printInitials();
    }
    public static double getSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];

                }
            }
        }
        return minSalaryEmployee;
    }
        public static Employee getEmployeeMaxSalary () {
            double maxSalary = -1;
            Employee maxSalaryEmployee = null;
            int index = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                    index = i;
                    break;
                }
            }
            for (int i = index; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (maxSalary < employees[i].getSalary()) {
                        maxSalary = employees[i].getSalary();
                        maxSalaryEmployee = employees[i];

                    }
                }
            }
            return maxSalaryEmployee;
        }
    public static double getAverageValue() {
        double sumSalary = getSalarySum();
        if (employees.length != 0) {
            return  sumSalary/employees.length;
        } else {
            return 0;
        }
    }
    public static void printInitials() {
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null){
                System.out.println(employees[i].getName() + " " +  employees[i].getPatronymic() + " " + employees[i].getSurname());
            }
        }
    }
    }


