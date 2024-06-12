import java.util.Scanner;

class do_all {
    public void arm(int a) {
        int temp = a;
        int sum = 0;
        while (a >= 1) {
            int r = a % 10;
            sum = (r * r * r) + sum;
            a = a / 10;
            if (a == 0) {
                if (temp == sum) {
                    System.out.println("Given " + temp + " Is Armstrong");
                } else {
                    System.out.println("Given " + temp + " Is not armstrong");
                }
            }
        }
        System.out.println();
    }

    public void prime(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Given Number Is Prime!!!");
        } else {
            System.out.println("Given Number Is Not Prime!!!");
        }
        System.out.println();
    }

    public void evenorodd(int a) {
        if (a % 2 == 0) {
            System.out.println("Given Number Is Even");
        } else {
            System.out.println("Given Number Is Odd");
        }
        System.out.println();
    }

    public void paliendram(int a) {
        int t = a, re = 0;
        while (a > 0) {
            int r = a % 10;
            re = re * 10 + r;
            a = a / 10;
        }
        if (re == t) {
            System.out.println("Given Number Is Paliendram");
        } else {
            System.out.println("Given Number Is Not Paliendram");
        }
        System.out.println();
    }

    public void fibanocii(int z) {
        int a = 0, b = 1, i = 2;
        System.out.print("Fibanocii series is :\n" + a + " " + b + " ");
        while (z >= i) {
            if (z <= 2) {
                break;
            } else {
                int c = a + b;
                System.out.print(c);
                a = b;
                b = c;
                i += 1;
            }
        }
        System.out.println();
    }

    public void perfect(int a) {
        int s = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                s = s + i;
            }
        }
        if (s == a) {
            System.out.println("Given Number Is Perfect Number!!");
        } else {
            System.out.println("Given Number Is Not Perfect Number!!");
        }
        System.out.println();
    }

    public void factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f = f * i;
        System.out.println("Given Number Factorial is " + f);
        System.out.println();
    }
}

class all {
    Scanner s1;

    public all(Scanner s1) {
        this.s1 = s1;
    }

    public void arm() {
        System.out.print("Enter An Armstrong Number: ");
        int n = s1.nextInt();
        int temp = n;
        int sum = 0;
        while (n >= 1) {
            int r = n % 10;
            sum = (r * r * r) + sum;
            n = n / 10;
            if (n == 0) {
                if (temp == sum) {
                    System.out.println("Given " + temp + " Is Armstrong");
                } else {
                    System.out.println("Given " + temp + " Is not armstrong");
                }
            }
        }
        System.out.println();
    }

    public void prime() {
        System.out.print("Enter An Prime Number: ");
        int p = s1.nextInt();
        int c = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Given Number Is Prime!!!");
        } else {
            System.out.println("Given Number Is Not Prime!!!");
        }
        System.out.println();
    }

    public void evenorodd() {
        System.out.print("Enter Any Number: ");
        int n = s1.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given Number Is Even");
        } else {
            System.out.println("Given Number Is Odd");
        }
        System.out.println();
    }

    public void paliendram() {
        System.out.print("Enter An Paliendram Number: ");
        int p = s1.nextInt();
        int t = p, re = 0;
        while (p > 0) {
            int r = p % 10;
            re = re * 10 + r;
            p = p / 10;
        }
        if (re == t) {
            System.out.println("Given Number Is Paliendram");
        } else {
            System.out.println("Given Number Is Not Paliendram");
        }
        System.out.println();
    }

    public void fibanocii() {
        System.out.print("Enter The Range Of Fibanocii Series: ");
        int f = s1.nextInt();
        int a = 0, b = 1, i = 2;

        do {
            if (i == 2) {
                System.out.print("Fibanocii series is :\n" + a + " " + b + " ");
            }
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        } while (f != i);
        System.out.println();
    }

    public void perfect() {
        System.out.print("Enter An Perfect Number: ");
        int p = s1.nextInt();
        int s = 0;
        for (int i = 1; i < p; i++) {
            if (p % i == 0) {
                s = s + i;
            }
        }
        if (s == p) {
            System.out.println("Given Number Is Perfect Number!!");
        } else {
            System.out.println("Given Number Is Not Perfect Number!!");
        }
        System.out.println();
    }

    public void factorial() {
        System.out.print("Enter Any Number: ");
        int n = s1.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        System.out.println("Given Number Factorial is " + f);
        System.out.println();
    }

    public static void main(String a[]) {
        Scanner sn = new Scanner(System.in);
        all ob = new all(sn);
        int ch;
        do {

            System.out.println();
            System.out.println("1.Armstrong Number ");
            System.out.println("2.Prime Number ");
            System.out.println("3.Even Or Odd ");
            System.out.println("4.Paliendram Number");
            System.out.println("5.Fibanocii Series ");
            System.out.println("6.Factorial Number");
            System.out.println("7.Perfect Number");
            System.out.println("8.Do Above All Categires");
            System.out.println("9.Exit to press the key '0'");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            ch = sn.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    ob.arm();
                    break;
                case 2:
                    ob.prime();
                    break;
                case 3:
                    ob.evenorodd();
                    break;
                case 4:
                    ob.paliendram();
                    break;
                case 5:
                    ob.fibanocii();
                    break;
                case 6:
                    ob.factorial();
                    break;
                case 7:
                    ob.perfect();
                    break;
                case 8:
                    System.out.println("1.Giving Single Value");
                    System.out.println("2.Giving Individual Values");
                    System.out.println();
                    System.out.print("Enter The Above Options Which You Prefer Choice:");
                    int c = sn.nextInt();
                    System.out.println();
                    if (c == 2) {
                        ob.arm();
                        ob.prime();
                        ob.evenorodd();
                        ob.paliendram();
                        ob.fibanocii();
                        ob.factorial();
                        ob.perfect();
                    } else {
                        System.out.print("Enter The Number:");
                        int n = sn.nextInt();
                        do_all as = new do_all();
                        as.arm(n);
                        as.prime(n);
                        as.evenorodd(n);
                        as.paliendram(n);
                        as.fibanocii(n);
                        as.factorial(n);
                        as.perfect(n);
                    }
                    break;
                default:
                    if (ch == 0) {
                        System.out.println("Thank You For Using This Program :)");
                    } else {
                        System.out.println("Please Enter The Correct Option :)");
                    }
            }
        } while (ch != 0);
        sn.close();

    }
}