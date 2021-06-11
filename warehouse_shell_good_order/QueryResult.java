// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 01 21:51:32 EDT 2021
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("user_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.user_id = (Long)value;
      }
    });
    setters.put("user_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.user_name = (String)value;
      }
    });
    setters.put("user_gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.user_gender = (Integer)value;
      }
    });
    setters.put("user_birthday", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.user_birthday = (java.sql.Timestamp)value;
      }
    });
    setters.put("e_mail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.e_mail = (String)value;
      }
    });
    setters.put("mobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.mobile = (String)value;
      }
    });
    setters.put("register_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.register_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("is_blacklist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.is_blacklist = (Integer)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private Long user_id;
  public Long get_user_id() {
    return user_id;
  }
  public void set_user_id(Long user_id) {
    this.user_id = user_id;
  }
  public QueryResult with_user_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }
  private String user_name;
  public String get_user_name() {
    return user_name;
  }
  public void set_user_name(String user_name) {
    this.user_name = user_name;
  }
  public QueryResult with_user_name(String user_name) {
    this.user_name = user_name;
    return this;
  }
  private Integer user_gender;
  public Integer get_user_gender() {
    return user_gender;
  }
  public void set_user_gender(Integer user_gender) {
    this.user_gender = user_gender;
  }
  public QueryResult with_user_gender(Integer user_gender) {
    this.user_gender = user_gender;
    return this;
  }
  private java.sql.Timestamp user_birthday;
  public java.sql.Timestamp get_user_birthday() {
    return user_birthday;
  }
  public void set_user_birthday(java.sql.Timestamp user_birthday) {
    this.user_birthday = user_birthday;
  }
  public QueryResult with_user_birthday(java.sql.Timestamp user_birthday) {
    this.user_birthday = user_birthday;
    return this;
  }
  private String e_mail;
  public String get_e_mail() {
    return e_mail;
  }
  public void set_e_mail(String e_mail) {
    this.e_mail = e_mail;
  }
  public QueryResult with_e_mail(String e_mail) {
    this.e_mail = e_mail;
    return this;
  }
  private String mobile;
  public String get_mobile() {
    return mobile;
  }
  public void set_mobile(String mobile) {
    this.mobile = mobile;
  }
  public QueryResult with_mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }
  private java.sql.Timestamp register_time;
  public java.sql.Timestamp get_register_time() {
    return register_time;
  }
  public void set_register_time(java.sql.Timestamp register_time) {
    this.register_time = register_time;
  }
  public QueryResult with_register_time(java.sql.Timestamp register_time) {
    this.register_time = register_time;
    return this;
  }
  private Integer is_blacklist;
  public Integer get_is_blacklist() {
    return is_blacklist;
  }
  public void set_is_blacklist(Integer is_blacklist) {
    this.is_blacklist = is_blacklist;
  }
  public QueryResult with_is_blacklist(Integer is_blacklist) {
    this.is_blacklist = is_blacklist;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.user_gender == null ? that.user_gender == null : this.user_gender.equals(that.user_gender));
    equal = equal && (this.user_birthday == null ? that.user_birthday == null : this.user_birthday.equals(that.user_birthday));
    equal = equal && (this.e_mail == null ? that.e_mail == null : this.e_mail.equals(that.e_mail));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.register_time == null ? that.register_time == null : this.register_time.equals(that.register_time));
    equal = equal && (this.is_blacklist == null ? that.is_blacklist == null : this.is_blacklist.equals(that.is_blacklist));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.user_gender == null ? that.user_gender == null : this.user_gender.equals(that.user_gender));
    equal = equal && (this.user_birthday == null ? that.user_birthday == null : this.user_birthday.equals(that.user_birthday));
    equal = equal && (this.e_mail == null ? that.e_mail == null : this.e_mail.equals(that.e_mail));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.register_time == null ? that.register_time == null : this.register_time.equals(that.register_time));
    equal = equal && (this.is_blacklist == null ? that.is_blacklist == null : this.is_blacklist.equals(that.is_blacklist));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.user_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_name = JdbcWritableBridge.readString(2, __dbResults);
    this.user_gender = JdbcWritableBridge.readInteger(3, __dbResults);
    this.user_birthday = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.e_mail = JdbcWritableBridge.readString(5, __dbResults);
    this.mobile = JdbcWritableBridge.readString(6, __dbResults);
    this.register_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.is_blacklist = JdbcWritableBridge.readInteger(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.user_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_name = JdbcWritableBridge.readString(2, __dbResults);
    this.user_gender = JdbcWritableBridge.readInteger(3, __dbResults);
    this.user_birthday = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.e_mail = JdbcWritableBridge.readString(5, __dbResults);
    this.mobile = JdbcWritableBridge.readString(6, __dbResults);
    this.register_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.is_blacklist = JdbcWritableBridge.readInteger(8, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(user_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(user_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_gender, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_birthday, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(e_mail, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(register_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(is_blacklist, 8 + __off, -6, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(user_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(user_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_gender, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_birthday, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(e_mail, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(register_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(is_blacklist, 8 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.user_name = null;
    } else {
    this.user_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_gender = null;
    } else {
    this.user_gender = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_birthday = null;
    } else {
    this.user_birthday = new Timestamp(__dataIn.readLong());
    this.user_birthday.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.e_mail = null;
    } else {
    this.e_mail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mobile = null;
    } else {
    this.mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.register_time = null;
    } else {
    this.register_time = new Timestamp(__dataIn.readLong());
    this.register_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_blacklist = null;
    } else {
    this.is_blacklist = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.user_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_gender);
    }
    if (null == this.user_birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_birthday.getTime());
    __dataOut.writeInt(this.user_birthday.getNanos());
    }
    if (null == this.e_mail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, e_mail);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.register_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.register_time.getTime());
    __dataOut.writeInt(this.register_time.getNanos());
    }
    if (null == this.is_blacklist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_blacklist);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.user_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_gender);
    }
    if (null == this.user_birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_birthday.getTime());
    __dataOut.writeInt(this.user_birthday.getNanos());
    }
    if (null == this.e_mail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, e_mail);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.register_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.register_time.getTime());
    __dataOut.writeInt(this.register_time.getNanos());
    }
    if (null == this.is_blacklist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_blacklist);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"\\N":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"\\N":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_gender==null?"\\N":"" + user_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_birthday==null?"\\N":"" + user_birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(e_mail==null?"\\N":e_mail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mobile==null?"\\N":mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(register_time==null?"\\N":"" + register_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_blacklist==null?"\\N":"" + is_blacklist, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"\\N":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"\\N":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_gender==null?"\\N":"" + user_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_birthday==null?"\\N":"" + user_birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(e_mail==null?"\\N":e_mail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mobile==null?"\\N":mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(register_time==null?"\\N":"" + register_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_blacklist==null?"\\N":"" + is_blacklist, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_gender = null; } else {
      this.user_gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_birthday = null; } else {
      this.user_birthday = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.e_mail = null; } else {
      this.e_mail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.register_time = null; } else {
      this.register_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_blacklist = null; } else {
      this.is_blacklist = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_gender = null; } else {
      this.user_gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_birthday = null; } else {
      this.user_birthday = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.e_mail = null; } else {
      this.e_mail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.register_time = null; } else {
      this.register_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_blacklist = null; } else {
      this.is_blacklist = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.user_birthday = (o.user_birthday != null) ? (java.sql.Timestamp) o.user_birthday.clone() : null;
    o.register_time = (o.register_time != null) ? (java.sql.Timestamp) o.register_time.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.user_birthday = (o.user_birthday != null) ? (java.sql.Timestamp) o.user_birthday.clone() : null;
    o.register_time = (o.register_time != null) ? (java.sql.Timestamp) o.register_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("user_gender", this.user_gender);
    __sqoop$field_map.put("user_birthday", this.user_birthday);
    __sqoop$field_map.put("e_mail", this.e_mail);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("register_time", this.register_time);
    __sqoop$field_map.put("is_blacklist", this.is_blacklist);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("user_gender", this.user_gender);
    __sqoop$field_map.put("user_birthday", this.user_birthday);
    __sqoop$field_map.put("e_mail", this.e_mail);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("register_time", this.register_time);
    __sqoop$field_map.put("is_blacklist", this.is_blacklist);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
