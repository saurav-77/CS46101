public class Exp8Solution {

    public static void main(String[] args) {
        NITPatna nitpObj = new NITPatna();
        nitpObj.teaching();
        nitpObj.nonTeaching();
        Department dp = new Department();
        dp.teaching();
        dp.nonTeaching();
        dp.student();
    }
}

class NITPatna {
    public void teaching() {
        System.out.println("teaching() method of class NITPatna is invoked.");
    }
    public void nonTeaching() {
        System.out.println("nonTeaching() method of class NITPatna is invoked.");
    }
}

class Department extends NITPatna {
    @Override
    public void teaching() {
        System.out.println("teaching() method of class Department is invoked.");
    }
    @Override
    public void nonTeaching() {
        System.out.println("nonTeaching() method of class Department is invoked.");
    }

    public void student() {
        System.out.println("student() method of class Department is invoked.");
    }
}