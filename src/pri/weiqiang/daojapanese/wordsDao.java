package pri.weiqiang.daojapanese;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import pri.weiqiang.daojapanese.words;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WORDS".
*/
public class wordsDao extends AbstractDao<words, Long> {

    public static final String TABLENAME = "WORDS";

    /**
     * Properties of entity words.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Book_id = new Property(1, String.class, "book_id", false, "BOOK_ID");
        public final static Property Lesson_id = new Property(2, String.class, "lesson_id", false, "LESSON_ID");
        public final static Property Word = new Property(3, String.class, "word", false, "WORD");
        public final static Property Phonetic = new Property(4, String.class, "phonetic", false, "PHONETIC");
        public final static Property Translation = new Property(5, String.class, "translation", false, "TRANSLATION");
        public final static Property Fav = new Property(6, Integer.class, "fav", false, "FAV");
        public final static Property Cache = new Property(7, Integer.class, "cache", false, "CACHE");
    };


    public wordsDao(DaoConfig config) {
        super(config);
    }
    
    public wordsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WORDS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"BOOK_ID\" TEXT NOT NULL ," + // 1: book_id
                "\"LESSON_ID\" TEXT," + // 2: lesson_id
                "\"WORD\" TEXT," + // 3: word
                "\"PHONETIC\" TEXT," + // 4: phonetic
                "\"TRANSLATION\" TEXT," + // 5: translation
                "\"FAV\" INTEGER," + // 6: fav
                "\"CACHE\" INTEGER);"); // 7: cache
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WORDS\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, words entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBook_id());
 
        String lesson_id = entity.getLesson_id();
        if (lesson_id != null) {
            stmt.bindString(3, lesson_id);
        }
 
        String word = entity.getWord();
        if (word != null) {
            stmt.bindString(4, word);
        }
 
        String phonetic = entity.getPhonetic();
        if (phonetic != null) {
            stmt.bindString(5, phonetic);
        }
 
        String translation = entity.getTranslation();
        if (translation != null) {
            stmt.bindString(6, translation);
        }
 
        Integer fav = entity.getFav();
        if (fav != null) {
            stmt.bindLong(7, fav);
        }
 
        Integer cache = entity.getCache();
        if (cache != null) {
            stmt.bindLong(8, cache);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public words readEntity(Cursor cursor, int offset) {
        words entity = new words( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // book_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // lesson_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // word
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // phonetic
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // translation
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // fav
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7) // cache
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, words entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBook_id(cursor.getString(offset + 1));
        entity.setLesson_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setWord(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPhonetic(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTranslation(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFav(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setCache(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(words entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(words entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
