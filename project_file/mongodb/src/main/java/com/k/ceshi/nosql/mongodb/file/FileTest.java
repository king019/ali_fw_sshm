package com.k.ceshi.nosql.mongodb.file;
import com.k.ceshi.nosql.mongodb.util.jt.JC;
import com.mongodb.BasicDBObject;
import com.mongodb.ReadPreference;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.util.List;
public class FileTest extends JC {
  @Override
  public void test() {
    try {
      db = mc.getDB("test");
      db.setReadPreference(ReadPreference.primaryPreferred());
      File f = new File("C:/Users/K/Desktop/shell/mongodb_64_install_slave_0.sh");
      cs = db.getCollection("cs");
      GridFSDBFile gf = new GridFSDBFile();
      myfs = new GridFS(db);
      GridFSInputFile gfs = myfs.createFile(f);
      gfs.save();
      List<GridFSDBFile> list = myfs.find(new BasicDBObject());
      GridFSDBFile list0 = list.get(0);
      System.out.println(list);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
