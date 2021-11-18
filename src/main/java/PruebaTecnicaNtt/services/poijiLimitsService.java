package PruebaTecnicaNtt.services;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;

import PruebaTecnicaNtt.model.Limit;

@Service

public class poijiLimitsService {
    PoijiOptionsBuilder options = PoijiOptions.PoijiOptionsBuilder.settings().headerStart(5);
    public List<Limit> getlimit() {
        return Poiji.fromExcel(
                new File("C:\\Users\\mgoncarm\\Desktop\\PruebaTecnicaNtt\\limitsTemplate.xlsx"), Limit.class);
    }
}
