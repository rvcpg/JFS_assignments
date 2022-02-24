import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class News { int newsId; String postedByUser; String commentByUser; String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }



    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
public class A9Q2 {
    public static int maxComments(List<News> news) {
        List<Integer> newsid = new ArrayList<>();
        news.forEach(p -> newsid.add(p.getNewsId()));
        return newsid.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparingInt(o -> Collections.frequency(newsid, o)))).orElse(0);
    }
    public static int budgetCount (List < News > news) {
        int budget= (int) news.stream()
                .filter(p->p.getComment().contains("budget")).count();
        return budget;
    }
    public static String maxUsercomments(List<News> news) {
        List<String> newsC = new ArrayList<>();
        news.forEach(p -> newsC.add(p.getCommentByUser()));
        String maxCommented = newsC.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparingInt(o -> Collections.frequency(newsC, o)))).orElse(null);
        return maxCommented;
    }

    public static Map<String,Integer> displaycommentsbyuser(List<News> news) {
        Map<String, Long> m;
        m=news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
        List < Map.Entry <String, Long> > list = new LinkedList<>(m.entrySet());
        list.sort((o1, o2) -> -(o1.getValue()).compareTo(o2.getValue()));
        HashMap<String, Integer> comCountByUser = new LinkedHashMap<>();
        for (Map.Entry<String, Long> aa : list) {
            comCountByUser.put(aa.getKey(), (int) (long)aa.getValue());
        }
        return comCountByUser;

    }
    public static void main(String[] args) {

        List<News> today = new ArrayList<>();
        today.add(new News(1, "Ravi", "Kumar", "comment"));
        today.add(new News(2, "Verma", "Jethiya", "comment"));
        today.add(new News(3, "Iyer", "Hathi", "budget"));
        today.add(new News(2, "Mehtus", "Champakiya", "budget "));
        today.add(new News(1, "Abdul", "Popatlal", "costly"));
        today.add(new News(3, "Sodhi", "bhindi", "costly"));

        System.out.println(maxComments(today));
        System.out.println(budgetCount(today));
        System.out.println(maxUsercomments(today));
        System.out.println(displaycommentsbyuser(today));

    }
}
