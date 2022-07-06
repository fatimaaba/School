import entity.*;
import repo.LessonRepository;
import repo.PayeRepository;
import repo.StudentRepository;
import repo.TeacherRepository;
import service.ManagerService;
import service.StudentService;
import service.TeacherService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ManagerService managerService = new ManagerService();
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        StudentRepository studentRepository = new StudentRepository();

        PayeRepository payeRepository = new PayeRepository();
        LessonRepository lessonRepository = new LessonRepository();
        TeacherRepository teacherRepository = new TeacherRepository();

        List<String> payeList = new LinkedList<>();
        List<String> lessonList = new LinkedList<>();
        List<String> teacherList = new LinkedList<>();


        Manager manager = new Manager();
        Teacher teacher = new Teacher();
        Lesson lesson = new Lesson();
        Score score = new Score();


        Scanner myscanner = new Scanner(System.in);
        System.out.printf("Enter Your Position : ");

        String nameOfPosition = myscanner.nextLine();
        System.out.println("Your Position is : " + nameOfPosition);


        if (nameOfPosition.equals("manager")) {
            System.out.println("You can select one of below activity : ");
            System.out.println("*************************************");
            System.out.println("1 - Add Student \n" + "2 - Delete Student \n" + "3 - Add Lesson \n"
                    + "4 - Add Teacher \n" + "5 - Delete Teacher \n" + "6 - Create Paye \n" + "7 - Delete Paye \n");

            System.out.println("plz enter one Activity : ");
            Scanner menuNumber = new Scanner(System.in);
            Integer menuNum = menuNumber.nextInt();

            Student student = new Student();

            if (menuNum.equals(1)){
                System.out.println("How many student u want to add? ");
                Scanner numberOfStu = new Scanner(System.in);
                Integer numberStu = numberOfStu.nextInt();


                for (int i = 1; i <= numberStu; i++) {
                    System.out.print("plz enter firstname and lastname of student" + i + " : ");
                    System.out.println("first name : ");
                    Scanner s1 = new Scanner(System.in);
                    String nameStu = s1.nextLine();
                    student.setFirstName(nameStu);

                    System.out.println("last Name : ");
                    Scanner s2 = new Scanner(System.in);
                    String lastName = s2.nextLine();
                    student.setLastName(lastName);

                    studentRepository.addstudent(student);
                }

            }else if (menuNum.equals(2)){
                System.out.printf("Plz enter the student's ID fro deleting student : ");
                long id = student.getId();
                studentRepository.deleteStudent(id);
                System.out.printf("mentioned student has been deleted");

            }else if(menuNum.equals(3)){

            }

            for (int i = 0; i < 2; i++) {

                Scanner scanner1 = new Scanner(System.in);
                System.out.printf("Plz enter paye : ");
                String nameOfPaye = scanner1.nextLine();
                Paye paye = new Paye();
                paye.setName(nameOfPaye);
                managerService.createPaye(paye);
                System.out.println("Payes : " + payeList);


                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Plz enter lesson : ");
                String lesson1 = scanner1.nextLine();
//                managerService.addLesson(lesson1);
                lessonList.add(lesson1);
                System.out.println("Lessons : " + lessonList);

                Scanner scanner3 = new Scanner(System.in);
                System.out.printf("Plz enter teacher : ");
                String teacher1 = scanner1.nextLine();
//                managerService.addTeacher(teacher);
                teacherList.add(teacher1);
                System.out.println("teachers : " + teacherList);

            }

            System.out.println("*******************");

            System.out.println("Payes : " + payeRepository.findAllPaye());
            System.out.println("Lessons : " + lessonRepository.findAll());
            System.out.println("Teachers : " + teacherRepository.findAll());

            System.out.println("*******************");


        } else if (nameOfPosition.equals(teacher)) {

            for (int j = 0; j < 1; j++) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.printf("Plz enter score : ");
                String score1 = scanner1.nextLine();
                teacherService.addScore(score);
            }
            System.out.println("Scores : " + score);

        } else {
            System.out.println("Your position is student : ");
            studentService.getScores();
            System.out.printf("Scores : " + score);
        }
    }

}
