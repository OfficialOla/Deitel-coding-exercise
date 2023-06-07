package chapterFour;

import java.util.Scanner;

public class Mobile3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        System.out.println("Please select an option: ");
        int userInput = scanner.nextInt();
//        String option = " ";
        switch (userInput) {
            case 1:
                System.out.println("""
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Option 
                        9. Speed dials
                        10. Voice tags
                        """);
                System.out.println("enter number: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 8:
                        System.out.println("""
                                1. Type of views
                                2. Memory status""");break;
            default:
                System.out.println("Enter valid number dummy!");}

            case 2:
                System.out.println("""
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Pictures
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """);
                System.out.println("enter a number: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 7:
                        System.out.println("""
                                1. set
                                2. common
                                """);
                        System.out.println("enter a number: ");
                        userInput = scanner.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println("""
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                        }
                        break;
                }
            case 3:
                break;
            case 4:
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepared credit
                        """);
                System.out.println("enter a number: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 5:
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """); break;
                    case 6:
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """); break;
                    case 7:
                        System.out.println("""
                                1. Call cost limit
                                2. Show costs in"""); break;
                    case 8:
                        break;
                }break;
            case 5:
                System.out.println("""
                        1.  Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5.Message alert tone
                        6. Keypad tones
                        7. Vibrating alert
                        9. Screen saver
                        """); break;
            case 6:
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings""");
                System.out.println("enter a number: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                    System.out.println("""
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer
                            """); break;
                    case 2:
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """); break;
                    case 3:
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """); break;
                        }
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                System.out.println("""
                        1. Alarm clock
                        2. Clock setting
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time""");
                break;
            default:
                System.out.println("Enter a valid number dummy!");
                }
            }
        }


