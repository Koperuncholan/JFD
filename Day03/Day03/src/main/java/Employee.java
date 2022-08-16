public class Employee {
        public static void main(String[] args) {
            Emp empOne = new Emp();

            empOne.setId(01);
            empOne.setName("krishna");
            empOne.setRole("developer");
            empOne.setPhone(1234567890);
            empOne.setMail("krish@gmail.com");
            empOne.showEmployeeDetails();

            Emp empTwo = new Emp();

            empTwo.setId(02);
            empTwo.setName("moorthy");
            empTwo.setRole("developer");
            empTwo.setPhone(987654321);
            empTwo.setMail("moorthy@gmail.com");
            empTwo.showEmployeeDetails();

            Emp empThree = new Emp(03,"cho","designer");
            empThree.setPhone(701001);
            empThree.setMail("cho@gmail.com");
            empThree.showEmployeeDetails();

        }

}
