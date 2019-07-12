package jd.downloader.code.programcreek;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.File;

/**
 * Created by huangxia on 2019/7/12.
 */
public class DrogramcreekDownloader {


    private static String HOST_BASE = "https://www.programcreek.com" ;
    private static String PROJECT_BASE = (HOST_BASE + "java-api-examples/?code=cloudezz/harmony/harmony-master/").intern();

    private static File LOCAL_PROJECT = new File("download/project/","harmony-master");

    public static void main(String[] args){

    }

    public static void downloadProject(){
        String queryStringInLocation = PROJECT_BASE.substring(PROJECT_BASE.indexOf("?")+1) ;
        if(queryStringInLocation.contains("#")){
            queryStringInLocation.substring(0,queryStringInLocation.indexOf("#"));
        }
        if(!queryStringInLocation.endsWith("/")){
            queryStringInLocation = queryStringInLocation.concat("/");
        }

        for(Element e : Jsoup.parse(PROJECT_BASE).select("treeview a>span")){
            String href = e.attr("href");
            if(href != null && href.length() > 3){ // href为可下载文件，不为#

            }
        }
    }
}
