package us.zamzow.mazwoz.dirtyunicornschangelog;

import android.util.Xml;

import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by bret on 6/5/13.
 */
public class GetChangelog {

    ReadXMLFile xmlFile = new ReadXMLFile();
    public GetChangelog()
    {
    }

    public String[] GetDUVersionList()
    {
        String[] versList = xmlFile.VersList();
        return versList;
    }

    public ArrayList<String> OpenDUChangelog(String DUVers)
    {
        ArrayList<String> changeList = new ArrayList<String>();

        return changeList;
    }
}


