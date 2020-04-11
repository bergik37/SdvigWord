package sample;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.*;

public class CreateDocument extends Controller {

    public CreateDocument()throws Exception{

        XWPFDocument document =  new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out =  new FileOutputStream(  new File( "D:/createdocument.docx"));

        XWPFTable table = document.createTable();

        //create first row
        XWPFTableRow tableRowOne = table.getRow(0);
        table.getBottomBorderColor();
        String d = String.valueOf(myTextField5);
        tableRowOne.getCell(0).setText(d);
        /*tableRowOne.addNewTableCell().setText("col two, row one");
        tableRowOne.addNewTableCell().setText("col three, row one");*/
        table.removeBorders();
        document.write(out);
        out.close();
        System.out.println(d);

    }
}
