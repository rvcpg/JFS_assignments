package Question3;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InfoService
{
    private List<Info> infos = Arrays.asList(new Info("Bihar","Patna","India","432004"),
            new Info("Karnataka","Bengaluru","India","432006")
    );

    public List<Info> getAllInfo()
    {
        return infos;
    }

    public Info getInfo(String zip)
    {
        return infos.stream().filter(i->i.getZip().equals(zip)).findFirst().get();
    }
}
