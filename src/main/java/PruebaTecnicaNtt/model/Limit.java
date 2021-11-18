package PruebaTecnicaNtt.model;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellRange;
import com.poiji.annotation.ExcelRow;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;

public class Limit {
     
    
    @ExcelRow
    public int rowIndex;

    @ExcelCell(0)
    public String countryId;

    @ExcelCell(1)
    public float millionLimits;

    @ExcelCell(2)
    public String currencyType;

    @ExcelCell(3)
    public String badgeId;

    @ExcelCell(4)
    public String comment;
    
    @ExcelCell(5)
    public String groupId;
    
    @ExcelCell(6)
    public String groupedSoc;

  }
