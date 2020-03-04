package com.clock.util;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作工具类
 */
public class NoteUtil {

    private String filePath = "D:/files/";

    /**
     * 创建新文件
     * @param noteName 文件名
     * @return 文件名
     */
    public String createNote(String noteName){
        try {
            File file = new File(filePath+noteName);
            System.out.println("创建文件");
            System.out.println(noteName);
            file.createNewFile();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return noteName;
    }

    /**
     * 将学生姓名写入文件
     * @param studentName 学生姓名
     * @param fileName 文件名
     */
    public void inputNote(String studentName, String fileName){
        try {
            File file = new File(filePath+fileName);
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("学生姓名");
            System.out.println(studentName);
            pw.println(studentName);
            fw.flush();
            pw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文件中所有打卡姓名，找出未打卡的姓名
     * @param fileName 文件名
     * @return 所有未打卡学生的姓名
     */
    public List<String> readNote(String fileName){
        List<String> studentName = new ArrayList<String>();
        try {
            File file = new File(filePath+fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String lineText = null;
            while ((lineText = br.readLine())!=null){
                System.out.println(lineText);
                studentName.add(new String(lineText));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentName;
    }
}
