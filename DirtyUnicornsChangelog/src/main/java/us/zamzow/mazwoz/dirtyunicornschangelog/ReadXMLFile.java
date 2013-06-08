package us.zamzow.mazwoz.dirtyunicornschangelog;

import android.content.res.Resources;
import android.util.Xml;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ReadXMLFile {

    public void ReadXMLFile() {

    }
    public String[] VersList(){
        String[] verList = new String[]{};
        ArrayList<Category> categories;
        XmlPullParser parser = Xml.newPullParser();
        try {
            String FILE = Resources.getSystem().getXml(R.xml.du_changelog).toString();
            File fXmlFile = new File(FILE);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work


            doc.getDocumentElement().normalize();


            NodeList nList = doc.getElementsByTagName("vers");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);


                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    verList[temp] = eElement.getAttribute("num");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return verList;
    }
}