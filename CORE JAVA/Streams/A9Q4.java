import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    class Transaction {
        private Trader trader;
        private int year;
        private int value;

        public Transaction(Trader trader, int year, int value) {
            this.trader = trader;
            this.year = year;
            this.value = value;
        }

        public Trader getTrader() {
            return trader;
        }

        public int getYear() {
            return year;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "trader=" + trader +
                    ", year=" + year +
                    ", value=" + value +
                    '}';
        }
    }
    public class A9Q4 {
        public static List<Transaction> sortTransactions(List <Transaction> transactions) {
            List<Transaction> sortedTrans= new ArrayList<>();
            sortedTrans=transactions.stream()
                    .filter(p->p.getYear()==2011)
                    .sorted(Comparator.comparingInt(Transaction::getValue))
                    .collect(Collectors.toCollection(ArrayList::new));
            return  sortedTrans;
        }

        public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
            List<Integer> transactioValueDelhi = new ArrayList<>();
            transactions.stream()
                    .filter(p->p.getTrader().getCity().equals("Delhi"))
                    .forEach(p->transactioValueDelhi.add(p.getValue()));
            System.out.println(transactioValueDelhi);
            return transactioValueDelhi;
        }
        public static int highestTransaction2(List<Transaction> transactions){
            int mx=Integer.MIN_VALUE;
            List<Integer>list = new ArrayList<>();
            transactions.stream()
                    .forEach(p->list.add(p.getValue()));
            mx =Collections.max(list);
            return  mx;
        }

        public static int smallestTransaction1(List<Transaction> transactions){
            int mn=Integer.MAX_VALUE;
            List<Integer>list = new ArrayList<>();
            transactions.stream()
                    .forEach(p->list.add(p.getValue()));
            mn =Collections.min(list);
            return  mn;

        }

        public static void main(String[] args) {
            Trader t1 = new Trader("Jethiya", "Bhachau");
            Trader t2 = new Trader("Bhindi", "Pune");
            Trader t3 = new Trader("Popat", "Bhopal");
            Trader t4 = new Trader("Mehtus", "Delhi");
            Trader t5= new Trader("Iyerdi", "Chennai");
            Trader t6 = new Trader("Hathida", "Lucknow");
            Trader t7 = new Trader("Sodhi", "Jalandhar");

            Transaction tr1 = new Transaction(t1,2011,700);
            Transaction tr2 = new Transaction(t2,2011,800);
            Transaction tr3 = new Transaction(t3,2010,900);
            Transaction tr4 = new Transaction(t4,2011,600);
            Transaction tr5 = new Transaction(t5,2014,600);
            Transaction tr6 = new Transaction(t6,2019,700);
            Transaction tr7 = new Transaction(t7,2020,800);

            ArrayList<Transaction> transactions = new ArrayList<>();
            transactions.add(tr1);
            transactions.add(tr2);
            transactions.add(tr3);
            transactions.add(tr4);
            transactions.add(tr5);
            transactions.add(tr6);
            transactions.add(tr7);
            sortTransactions(transactions);
            transaction3sValuesDelhi(transactions);
            System.out.println(highestTransaction2(transactions));


        }
    }