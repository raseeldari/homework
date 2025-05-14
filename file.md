1.איך יוצור תיקיה חדשה בגאווה?
כדי ליצור תיקיה חדשה בגאווה משתמשים במחלקה File ובשיטה mkdir()
File folder = new File("NewFolder);
boolean created = folder.mkdir();
הסבר:
השיטה mkdir()מחזירה true אם התיקיה נוצרה בהצלחה, אחרת false
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#mkdir--
 ************
2.איך יוצרים קובץ בגאווה?
כדי ליצור קובץ חדש, משתמשים במחלקהFile ובשיטה creatNewFile()
File file = new File ("newfile.txt");
boolean created = file.creatNewFile();
הסבר:
השיטה יוצרת קובץ חדש ומחזירה true אם הצליחה , או false אם הקובץ כבר קיים
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#createNewFile–
*************
3.איך בודקים אם קובץ או תיקיה קיימים?
משתמשים בשיטה exists()כדי לבדוק אם הקובץ או התיקיה קיימים
File file = new File ("newfile.txt");
if(file.exists()){
System.out.println("הקובץ קיים");
}else{
System.out.println("הקובץ לא קיים");
}
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#exists--
**************
4.איך מוחקים קובץ או תיקיה?
משתמשים בשיטה delete()כדי למחוק קובץ או תיקיה תוך בדיקה אם קיימים
File file = new File ("newfile.txt");
if(file.exists()){
if (file.delete()){
System.out.println("הקובץ נמחק בהצלחה");
}else{
System.out.println(" נכשל במחיקת הקובץ");
}
}else{
System.out.println("הקובץ לא קיים");
}
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#delete–
**************
5.מה ההבדל בין File ל-Path?
File :  ייצוג ישן של קובץ או תיקיה.מספק פעולות בסיסיות כמו יצירה, מחיקה ובדיקה
Path : -ייצוג מודרני יותר שהוצג בJava NIO  מאפשר עבודה מתקדמת עם נתיבים ומערכות קבצים
import java.nio.file.path;
import java.nio.file.path;
path path = paths.get("newfile.txt");
https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html