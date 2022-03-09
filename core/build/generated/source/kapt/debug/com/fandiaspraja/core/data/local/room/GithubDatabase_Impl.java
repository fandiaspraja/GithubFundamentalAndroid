package com.fandiaspraja.core.data.local.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GithubDatabase_Impl extends GithubDatabase {
  private volatile GithubDao _githubDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`gists_url` TEXT, `repos_url` TEXT, `following_url` TEXT, `twitter_username` TEXT, `bio` TEXT, `created_at` TEXT, `login` TEXT, `type` TEXT, `blog` TEXT, `subscriptions_url` TEXT, `update_at` TEXT, `site_admin` INTEGER, `company` TEXT, `id` INTEGER NOT NULL, `public_repos` INTEGER, `gravatar_id` TEXT, `email` TEXT, `organizations_url` TEXT, `hireable` TEXT, `starred_url` TEXT, `followers_url` TEXT, `public_gists` INTEGER, `url` TEXT, `received_events_url` TEXT, `followers` INTEGER, `avatar_url` TEXT, `events_url` TEXT, `html_url` TEXT, `following` INTEGER, `name` TEXT, `location` TEXT, `node_id` TEXT, `isFav` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `followers` (`user_id` INTEGER, `gists_url` TEXT, `repos_url` TEXT, `following_url` TEXT, `starred_url` TEXT, `login` TEXT, `followers_url` TEXT, `type` TEXT, `url` TEXT, `subscriptions_url` TEXT, `receivedEvents_url` TEXT, `avatar_url` TEXT, `events_url` TEXT, `html_url` TEXT, `site_admin` INTEGER, `id` INTEGER, `gravatar_id` TEXT, `node_id` TEXT, `organizations_url` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `following` (`user_id` INTEGER, `gists_url` TEXT, `repos_url` TEXT, `following_url` TEXT, `starred_url` TEXT, `login` TEXT, `followers_url` TEXT, `type` TEXT, `url` TEXT, `subscriptions_url` TEXT, `receivedEvents_url` TEXT, `avatar_url` TEXT, `events_url` TEXT, `html_url` TEXT, `site_admin` INTEGER, `id` INTEGER, `gravatar_id` TEXT, `node_id` TEXT, `organizations_url` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '77420402a393bf9ebac2c8f3c659b52a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        _db.execSQL("DROP TABLE IF EXISTS `followers`");
        _db.execSQL("DROP TABLE IF EXISTS `following`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(33);
        _columnsUser.put("gists_url", new TableInfo.Column("gists_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("repos_url", new TableInfo.Column("repos_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("following_url", new TableInfo.Column("following_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("twitter_username", new TableInfo.Column("twitter_username", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("bio", new TableInfo.Column("bio", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("login", new TableInfo.Column("login", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("blog", new TableInfo.Column("blog", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("subscriptions_url", new TableInfo.Column("subscriptions_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("update_at", new TableInfo.Column("update_at", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("site_admin", new TableInfo.Column("site_admin", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("company", new TableInfo.Column("company", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("public_repos", new TableInfo.Column("public_repos", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("gravatar_id", new TableInfo.Column("gravatar_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("organizations_url", new TableInfo.Column("organizations_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("hireable", new TableInfo.Column("hireable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("starred_url", new TableInfo.Column("starred_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("followers_url", new TableInfo.Column("followers_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("public_gists", new TableInfo.Column("public_gists", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("received_events_url", new TableInfo.Column("received_events_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("followers", new TableInfo.Column("followers", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("events_url", new TableInfo.Column("events_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("html_url", new TableInfo.Column("html_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("following", new TableInfo.Column("following", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("node_id", new TableInfo.Column("node_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("isFav", new TableInfo.Column("isFav", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "user(com.fandiaspraja.core.data.local.entity.UserEntity).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsFollowers = new HashMap<String, TableInfo.Column>(19);
        _columnsFollowers.put("user_id", new TableInfo.Column("user_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("gists_url", new TableInfo.Column("gists_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("repos_url", new TableInfo.Column("repos_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("following_url", new TableInfo.Column("following_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("starred_url", new TableInfo.Column("starred_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("login", new TableInfo.Column("login", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("followers_url", new TableInfo.Column("followers_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("subscriptions_url", new TableInfo.Column("subscriptions_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("receivedEvents_url", new TableInfo.Column("receivedEvents_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("events_url", new TableInfo.Column("events_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("html_url", new TableInfo.Column("html_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("site_admin", new TableInfo.Column("site_admin", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("gravatar_id", new TableInfo.Column("gravatar_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("node_id", new TableInfo.Column("node_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowers.put("organizations_url", new TableInfo.Column("organizations_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFollowers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFollowers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFollowers = new TableInfo("followers", _columnsFollowers, _foreignKeysFollowers, _indicesFollowers);
        final TableInfo _existingFollowers = TableInfo.read(_db, "followers");
        if (! _infoFollowers.equals(_existingFollowers)) {
          return new RoomOpenHelper.ValidationResult(false, "followers(com.fandiaspraja.core.data.local.entity.FollowersEntity).\n"
                  + " Expected:\n" + _infoFollowers + "\n"
                  + " Found:\n" + _existingFollowers);
        }
        final HashMap<String, TableInfo.Column> _columnsFollowing = new HashMap<String, TableInfo.Column>(19);
        _columnsFollowing.put("user_id", new TableInfo.Column("user_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("gists_url", new TableInfo.Column("gists_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("repos_url", new TableInfo.Column("repos_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("following_url", new TableInfo.Column("following_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("starred_url", new TableInfo.Column("starred_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("login", new TableInfo.Column("login", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("followers_url", new TableInfo.Column("followers_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("subscriptions_url", new TableInfo.Column("subscriptions_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("receivedEvents_url", new TableInfo.Column("receivedEvents_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("events_url", new TableInfo.Column("events_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("html_url", new TableInfo.Column("html_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("site_admin", new TableInfo.Column("site_admin", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("gravatar_id", new TableInfo.Column("gravatar_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("node_id", new TableInfo.Column("node_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFollowing.put("organizations_url", new TableInfo.Column("organizations_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFollowing = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFollowing = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFollowing = new TableInfo("following", _columnsFollowing, _foreignKeysFollowing, _indicesFollowing);
        final TableInfo _existingFollowing = TableInfo.read(_db, "following");
        if (! _infoFollowing.equals(_existingFollowing)) {
          return new RoomOpenHelper.ValidationResult(false, "following(com.fandiaspraja.core.data.local.entity.FollowingEntity).\n"
                  + " Expected:\n" + _infoFollowing + "\n"
                  + " Found:\n" + _existingFollowing);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "77420402a393bf9ebac2c8f3c659b52a", "1279bc0ae38540705e9ecf0b64fa0418");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user","followers","following");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user`");
      _db.execSQL("DELETE FROM `followers`");
      _db.execSQL("DELETE FROM `following`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(GithubDao.class, GithubDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public GithubDao githubDao() {
    if (_githubDao != null) {
      return _githubDao;
    } else {
      synchronized(this) {
        if(_githubDao == null) {
          _githubDao = new GithubDao_Impl(this);
        }
        return _githubDao;
      }
    }
  }
}
