package breakSnacks;

import java.util.Scanner;

public class Questionnaire {
    static int questionNumber = 1;

    public static void main(String[] args) {

            String[] test1 = {
                    "A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one",
                    "A. more outgoing, think out loud. B. more reserved, think to yourself",
                    "A. seek many tasks, public activities, interaction with others. " +
                            "B. seek private solitary activities with quiet to concentrate",
                    "A. external, communicative,  express yourself. B. internal, reticent, keep to yourself",
                    "A. active, initiate. B. reflective, deliberate"};

            String[] test2 = {
                    "A. interpret literally. B. look for meaning and possibilities",
                    "A. practical, realistic, experiential. B. imaginative, innovative, theoretical",
                    "A. standard, usual, conventional. B. different, novel, unique",
                    "A. focus on here-and-now\" .B.look to the future, global perspective, \"big picture\"",
                     "A. facts, things, \"what is\". B. ideas, dreams, \"what could be,\" philosophical"
            };
            String[] test3 = {
                    "A. logical, thinking, questioning. B. empathetic, feeling, accommodating",
                    "B. candid, straight forward, frank. B.tactful, kind, encouraging",
                    "A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
                    "A. tough-minded, just B.tender-hearted, merciful",
                    "A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate",
            };
            String[] test4
                    = {
                    "A. organized, orderly. B. flexible, adaptable",
                    "A. plan, schedule B. unplanned, spontaneous",
                    "A. regulated, structured B. easygoing, “live\" and “let live\"",
                    "A. preparation, plan ahead. B. go with the flow, adapt as you go",
                    "A. control, govern B. latitude, freedom"};

            int[] test1AnswerStorage = new int[5];
            int[] test2AnswerStorage = new int[5];
            int[] test3AnswerStorage = new int[5];
            int[] test4AnswerStorage = new int[5];

            StringBuilder result = new StringBuilder();

            iterate(test1,test1AnswerStorage);
            iterate(test2,test2AnswerStorage);
            iterate(test3,test3AnswerStorage);
            iterate(test4,test4AnswerStorage);

            int sumOfTest1Answer = sum(test1AnswerStorage);
            int sumOfTest2Answer = sum(test2AnswerStorage);
            int sumOfTest3Answer = sum(test3AnswerStorage);
            int sumOfTest4Answer = sum(test4AnswerStorage);

            if (sumOfTest1Answer > 2) result.append("E");
            else {
                result.append("I");
            }

            if (sumOfTest2Answer > 2) result.append("S");
            else {
                result.append("N");
            }

            if (sumOfTest3Answer > 2) result.append("T");
            else {
                result.append("F");
            }

            if(sumOfTest4Answer > 2) result.append("J");
            else{
                result.append("P");
            }
            System.out.println("MYERS BRIGGS ANSWER SHEET ");
            System.out.println("Your personality type is " + result);
            System.out.print("For your personality interpretation, please visit : ");
            System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");

        }
        public static void iterate(String[] questions, int[] answers) {
            String optionAorB;
            for (int number = 0; number < questions.length; number++) {
                System.out.println("MYERS BRIGGS PERSONALITY TEST ");
                System.out.printf("Question %d%n", questionNumber++);
                System.out.println(questions[number]);
                System.out.println("Pick an option: A or B");
                optionAorB = getOption();
                if ((optionAorB.equalsIgnoreCase("A"))){
                    answers[number] = 1;
                }
            }
        }
        public static int sum(int[] intArrays){
            int sum = 0;
            for(int number : intArrays) sum += number;
            return sum;
        }
            public static String getOption(){
                String option;
                Scanner input = new Scanner(System.in);
                while (true){
                    try {
                        option = input.nextLine().trim();
                        if(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("B")){
                            return option;
                        }else {
                            throw new IllegalArgumentException("Wrong choice; choose A or B");
                        }
                    }catch (IllegalArgumentException ex){
                        System.err.println(ex.getMessage());
                    }
                }
            }
        }