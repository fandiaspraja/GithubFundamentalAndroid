package com.fandiaspraja.core.data.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.fandiaspraja.core.data.local.entity.FollowersEntity;
import com.fandiaspraja.core.data.local.entity.FollowingEntity;
import com.fandiaspraja.core.data.local.entity.UserEntity;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GithubDao_Impl implements GithubDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final EntityInsertionAdapter<FollowersEntity> __insertionAdapterOfFollowersEntity;

  private final EntityInsertionAdapter<FollowingEntity> __insertionAdapterOfFollowingEntity;

  private final EntityDeletionOrUpdateAdapter<UserEntity> __deletionAdapterOfUserEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUsergithubByid;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFollowers;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFollowing;

  public GithubDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user` (`gists_url`,`repos_url`,`following_url`,`twitter_username`,`bio`,`created_at`,`login`,`type`,`blog`,`subscriptions_url`,`update_at`,`site_admin`,`company`,`id`,`public_repos`,`gravatar_id`,`email`,`organizations_url`,`hireable`,`starred_url`,`followers_url`,`public_gists`,`url`,`received_events_url`,`followers`,`avatar_url`,`events_url`,`html_url`,`following`,`name`,`location`,`node_id`,`isFav`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        if (value.getGists_url() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getGists_url());
        }
        if (value.getRepos_url() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRepos_url());
        }
        if (value.getFollowing_url() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFollowing_url());
        }
        if (value.getTwitter_username() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTwitter_username());
        }
        if (value.getBio() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBio());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreated_at());
        }
        if (value.getLogin() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLogin());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getBlog() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBlog());
        }
        if (value.getSubscriptions_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSubscriptions_url());
        }
        if (value.getUpdate_at() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUpdate_at());
        }
        final Integer _tmp;
        _tmp = value.getSite_admin() == null ? null : (value.getSite_admin() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp);
        }
        if (value.getCompany() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCompany());
        }
        stmt.bindLong(14, value.getId());
        if (value.getPublic_repos() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getPublic_repos());
        }
        if (value.getGravatar_id() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getGravatar_id());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getEmail());
        }
        if (value.getOrganizations_url() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getOrganizations_url());
        }
        if (value.getHireable() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getHireable());
        }
        if (value.getStarred_url() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStarred_url());
        }
        if (value.getFollowers_url() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getFollowers_url());
        }
        if (value.getPublic_gists() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, value.getPublic_gists());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getUrl());
        }
        if (value.getReceived_events_url() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getReceived_events_url());
        }
        if (value.getFollowers() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindLong(25, value.getFollowers());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getAvatar_url());
        }
        if (value.getEvents_url() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getEvents_url());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getHtml_url());
        }
        if (value.getFollowing() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindLong(29, value.getFollowing());
        }
        if (value.getName() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getName());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getLocation());
        }
        if (value.getNode_id() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getNode_id());
        }
        final int _tmp_1;
        _tmp_1 = value.isFav() ? 1 : 0;
        stmt.bindLong(33, _tmp_1);
      }
    };
    this.__insertionAdapterOfFollowersEntity = new EntityInsertionAdapter<FollowersEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `followers` (`user_id`,`gists_url`,`repos_url`,`following_url`,`starred_url`,`login`,`followers_url`,`type`,`url`,`subscriptions_url`,`receivedEvents_url`,`avatar_url`,`events_url`,`html_url`,`site_admin`,`id`,`gravatar_id`,`node_id`,`organizations_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FollowersEntity value) {
        if (value.getUser_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUser_id());
        }
        if (value.getGists_url() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGists_url());
        }
        if (value.getRepos_url() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRepos_url());
        }
        if (value.getFollowing_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFollowing_url());
        }
        if (value.getStarred_url() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStarred_url());
        }
        if (value.getLogin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLogin());
        }
        if (value.getFollowers_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFollowers_url());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
        if (value.getSubscriptions_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSubscriptions_url());
        }
        if (value.getReceivedEvents_url() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getReceivedEvents_url());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAvatar_url());
        }
        if (value.getEvents_url() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getEvents_url());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getHtml_url());
        }
        final Integer _tmp;
        _tmp = value.getSite_admin() == null ? null : (value.getSite_admin() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, value.getId());
        }
        if (value.getGravatar_id() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getGravatar_id());
        }
        if (value.getNode_id() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getNode_id());
        }
        if (value.getOrganizations_url() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getOrganizations_url());
        }
      }
    };
    this.__insertionAdapterOfFollowingEntity = new EntityInsertionAdapter<FollowingEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `following` (`user_id`,`gists_url`,`repos_url`,`following_url`,`starred_url`,`login`,`followers_url`,`type`,`url`,`subscriptions_url`,`receivedEvents_url`,`avatar_url`,`events_url`,`html_url`,`site_admin`,`id`,`gravatar_id`,`node_id`,`organizations_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FollowingEntity value) {
        if (value.getUser_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUser_id());
        }
        if (value.getGists_url() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGists_url());
        }
        if (value.getRepos_url() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRepos_url());
        }
        if (value.getFollowing_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFollowing_url());
        }
        if (value.getStarred_url() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStarred_url());
        }
        if (value.getLogin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLogin());
        }
        if (value.getFollowers_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFollowers_url());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
        if (value.getSubscriptions_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSubscriptions_url());
        }
        if (value.getReceivedEvents_url() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getReceivedEvents_url());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAvatar_url());
        }
        if (value.getEvents_url() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getEvents_url());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getHtml_url());
        }
        final Integer _tmp;
        _tmp = value.getSite_admin() == null ? null : (value.getSite_admin() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, value.getId());
        }
        if (value.getGravatar_id() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getGravatar_id());
        }
        if (value.getNode_id() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getNode_id());
        }
        if (value.getOrganizations_url() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getOrganizations_url());
        }
      }
    };
    this.__deletionAdapterOfUserEntity = new EntityDeletionOrUpdateAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteUsergithubByid = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFollowers = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM followers WHERE user_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFollowing = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM following WHERE user_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertUserFavorite(final UserEntity userGithub) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserEntity.insert(userGithub);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertFollowers(final List<FollowersEntity> followers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFollowersEntity.insert(followers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertFollowing(final List<FollowingEntity> following) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFollowingEntity.insert(following);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUsergithub(final UserEntity userGithub) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserEntity.handle(userGithub);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUsergithubByid(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUsergithubByid.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUsergithubByid.release(_stmt);
    }
  }

  @Override
  public void deleteFollowers(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFollowers.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteFollowers.release(_stmt);
    }
  }

  @Override
  public void deleteFollowing(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFollowing.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteFollowing.release(_stmt);
    }
  }

  @Override
  public Flow<List<UserEntity>> findAllUsergithub() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"user"}, new Callable<List<UserEntity>>() {
      @Override
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGistsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "gists_url");
          final int _cursorIndexOfReposUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "repos_url");
          final int _cursorIndexOfFollowingUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "following_url");
          final int _cursorIndexOfTwitterUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter_username");
          final int _cursorIndexOfBio = CursorUtil.getColumnIndexOrThrow(_cursor, "bio");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfBlog = CursorUtil.getColumnIndexOrThrow(_cursor, "blog");
          final int _cursorIndexOfSubscriptionsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptions_url");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "update_at");
          final int _cursorIndexOfSiteAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "site_admin");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPublicRepos = CursorUtil.getColumnIndexOrThrow(_cursor, "public_repos");
          final int _cursorIndexOfGravatarId = CursorUtil.getColumnIndexOrThrow(_cursor, "gravatar_id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfOrganizationsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "organizations_url");
          final int _cursorIndexOfHireable = CursorUtil.getColumnIndexOrThrow(_cursor, "hireable");
          final int _cursorIndexOfStarredUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "starred_url");
          final int _cursorIndexOfFollowersUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "followers_url");
          final int _cursorIndexOfPublicGists = CursorUtil.getColumnIndexOrThrow(_cursor, "public_gists");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfReceivedEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "received_events_url");
          final int _cursorIndexOfFollowers = CursorUtil.getColumnIndexOrThrow(_cursor, "followers");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "events_url");
          final int _cursorIndexOfHtmlUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "html_url");
          final int _cursorIndexOfFollowing = CursorUtil.getColumnIndexOrThrow(_cursor, "following");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "node_id");
          final int _cursorIndexOfIsFav = CursorUtil.getColumnIndexOrThrow(_cursor, "isFav");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpGists_url;
            if (_cursor.isNull(_cursorIndexOfGistsUrl)) {
              _tmpGists_url = null;
            } else {
              _tmpGists_url = _cursor.getString(_cursorIndexOfGistsUrl);
            }
            final String _tmpRepos_url;
            if (_cursor.isNull(_cursorIndexOfReposUrl)) {
              _tmpRepos_url = null;
            } else {
              _tmpRepos_url = _cursor.getString(_cursorIndexOfReposUrl);
            }
            final String _tmpFollowing_url;
            if (_cursor.isNull(_cursorIndexOfFollowingUrl)) {
              _tmpFollowing_url = null;
            } else {
              _tmpFollowing_url = _cursor.getString(_cursorIndexOfFollowingUrl);
            }
            final String _tmpTwitter_username;
            if (_cursor.isNull(_cursorIndexOfTwitterUsername)) {
              _tmpTwitter_username = null;
            } else {
              _tmpTwitter_username = _cursor.getString(_cursorIndexOfTwitterUsername);
            }
            final String _tmpBio;
            if (_cursor.isNull(_cursorIndexOfBio)) {
              _tmpBio = null;
            } else {
              _tmpBio = _cursor.getString(_cursorIndexOfBio);
            }
            final String _tmpCreated_at;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreated_at = null;
            } else {
              _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpBlog;
            if (_cursor.isNull(_cursorIndexOfBlog)) {
              _tmpBlog = null;
            } else {
              _tmpBlog = _cursor.getString(_cursorIndexOfBlog);
            }
            final String _tmpSubscriptions_url;
            if (_cursor.isNull(_cursorIndexOfSubscriptionsUrl)) {
              _tmpSubscriptions_url = null;
            } else {
              _tmpSubscriptions_url = _cursor.getString(_cursorIndexOfSubscriptionsUrl);
            }
            final String _tmpUpdate_at;
            if (_cursor.isNull(_cursorIndexOfUpdateAt)) {
              _tmpUpdate_at = null;
            } else {
              _tmpUpdate_at = _cursor.getString(_cursorIndexOfUpdateAt);
            }
            final Boolean _tmpSite_admin;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfSiteAdmin)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfSiteAdmin);
            }
            _tmpSite_admin = _tmp == null ? null : _tmp != 0;
            final String _tmpCompany;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmpCompany = null;
            } else {
              _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpPublic_repos;
            if (_cursor.isNull(_cursorIndexOfPublicRepos)) {
              _tmpPublic_repos = null;
            } else {
              _tmpPublic_repos = _cursor.getInt(_cursorIndexOfPublicRepos);
            }
            final String _tmpGravatar_id;
            if (_cursor.isNull(_cursorIndexOfGravatarId)) {
              _tmpGravatar_id = null;
            } else {
              _tmpGravatar_id = _cursor.getString(_cursorIndexOfGravatarId);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpOrganizations_url;
            if (_cursor.isNull(_cursorIndexOfOrganizationsUrl)) {
              _tmpOrganizations_url = null;
            } else {
              _tmpOrganizations_url = _cursor.getString(_cursorIndexOfOrganizationsUrl);
            }
            final String _tmpHireable;
            if (_cursor.isNull(_cursorIndexOfHireable)) {
              _tmpHireable = null;
            } else {
              _tmpHireable = _cursor.getString(_cursorIndexOfHireable);
            }
            final String _tmpStarred_url;
            if (_cursor.isNull(_cursorIndexOfStarredUrl)) {
              _tmpStarred_url = null;
            } else {
              _tmpStarred_url = _cursor.getString(_cursorIndexOfStarredUrl);
            }
            final String _tmpFollowers_url;
            if (_cursor.isNull(_cursorIndexOfFollowersUrl)) {
              _tmpFollowers_url = null;
            } else {
              _tmpFollowers_url = _cursor.getString(_cursorIndexOfFollowersUrl);
            }
            final Integer _tmpPublic_gists;
            if (_cursor.isNull(_cursorIndexOfPublicGists)) {
              _tmpPublic_gists = null;
            } else {
              _tmpPublic_gists = _cursor.getInt(_cursorIndexOfPublicGists);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpReceived_events_url;
            if (_cursor.isNull(_cursorIndexOfReceivedEventsUrl)) {
              _tmpReceived_events_url = null;
            } else {
              _tmpReceived_events_url = _cursor.getString(_cursorIndexOfReceivedEventsUrl);
            }
            final Integer _tmpFollowers;
            if (_cursor.isNull(_cursorIndexOfFollowers)) {
              _tmpFollowers = null;
            } else {
              _tmpFollowers = _cursor.getInt(_cursorIndexOfFollowers);
            }
            final String _tmpAvatar_url;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatar_url = null;
            } else {
              _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final String _tmpEvents_url;
            if (_cursor.isNull(_cursorIndexOfEventsUrl)) {
              _tmpEvents_url = null;
            } else {
              _tmpEvents_url = _cursor.getString(_cursorIndexOfEventsUrl);
            }
            final String _tmpHtml_url;
            if (_cursor.isNull(_cursorIndexOfHtmlUrl)) {
              _tmpHtml_url = null;
            } else {
              _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
            }
            final Integer _tmpFollowing;
            if (_cursor.isNull(_cursorIndexOfFollowing)) {
              _tmpFollowing = null;
            } else {
              _tmpFollowing = _cursor.getInt(_cursorIndexOfFollowing);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final boolean _tmpIsFav;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFav);
            _tmpIsFav = _tmp_1 != 0;
            _item = new UserEntity(_tmpGists_url,_tmpRepos_url,_tmpFollowing_url,_tmpTwitter_username,_tmpBio,_tmpCreated_at,_tmpLogin,_tmpType,_tmpBlog,_tmpSubscriptions_url,_tmpUpdate_at,_tmpSite_admin,_tmpCompany,_tmpId,_tmpPublic_repos,_tmpGravatar_id,_tmpEmail,_tmpOrganizations_url,_tmpHireable,_tmpStarred_url,_tmpFollowers_url,_tmpPublic_gists,_tmpUrl,_tmpReceived_events_url,_tmpFollowers,_tmpAvatar_url,_tmpEvents_url,_tmpHtml_url,_tmpFollowing,_tmpName,_tmpLocation,_tmpNode_id,_tmpIsFav);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Cursor findAll() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor findByid(final int id) {
    final String _sql = "SELECT * FROM user WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Flow<UserEntity> findUserByid(final int id) {
    final String _sql = "SELECT * FROM user WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"user"}, new Callable<UserEntity>() {
      @Override
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGistsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "gists_url");
          final int _cursorIndexOfReposUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "repos_url");
          final int _cursorIndexOfFollowingUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "following_url");
          final int _cursorIndexOfTwitterUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter_username");
          final int _cursorIndexOfBio = CursorUtil.getColumnIndexOrThrow(_cursor, "bio");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfBlog = CursorUtil.getColumnIndexOrThrow(_cursor, "blog");
          final int _cursorIndexOfSubscriptionsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptions_url");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "update_at");
          final int _cursorIndexOfSiteAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "site_admin");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPublicRepos = CursorUtil.getColumnIndexOrThrow(_cursor, "public_repos");
          final int _cursorIndexOfGravatarId = CursorUtil.getColumnIndexOrThrow(_cursor, "gravatar_id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfOrganizationsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "organizations_url");
          final int _cursorIndexOfHireable = CursorUtil.getColumnIndexOrThrow(_cursor, "hireable");
          final int _cursorIndexOfStarredUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "starred_url");
          final int _cursorIndexOfFollowersUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "followers_url");
          final int _cursorIndexOfPublicGists = CursorUtil.getColumnIndexOrThrow(_cursor, "public_gists");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfReceivedEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "received_events_url");
          final int _cursorIndexOfFollowers = CursorUtil.getColumnIndexOrThrow(_cursor, "followers");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "events_url");
          final int _cursorIndexOfHtmlUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "html_url");
          final int _cursorIndexOfFollowing = CursorUtil.getColumnIndexOrThrow(_cursor, "following");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "node_id");
          final int _cursorIndexOfIsFav = CursorUtil.getColumnIndexOrThrow(_cursor, "isFav");
          final UserEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpGists_url;
            if (_cursor.isNull(_cursorIndexOfGistsUrl)) {
              _tmpGists_url = null;
            } else {
              _tmpGists_url = _cursor.getString(_cursorIndexOfGistsUrl);
            }
            final String _tmpRepos_url;
            if (_cursor.isNull(_cursorIndexOfReposUrl)) {
              _tmpRepos_url = null;
            } else {
              _tmpRepos_url = _cursor.getString(_cursorIndexOfReposUrl);
            }
            final String _tmpFollowing_url;
            if (_cursor.isNull(_cursorIndexOfFollowingUrl)) {
              _tmpFollowing_url = null;
            } else {
              _tmpFollowing_url = _cursor.getString(_cursorIndexOfFollowingUrl);
            }
            final String _tmpTwitter_username;
            if (_cursor.isNull(_cursorIndexOfTwitterUsername)) {
              _tmpTwitter_username = null;
            } else {
              _tmpTwitter_username = _cursor.getString(_cursorIndexOfTwitterUsername);
            }
            final String _tmpBio;
            if (_cursor.isNull(_cursorIndexOfBio)) {
              _tmpBio = null;
            } else {
              _tmpBio = _cursor.getString(_cursorIndexOfBio);
            }
            final String _tmpCreated_at;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreated_at = null;
            } else {
              _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpBlog;
            if (_cursor.isNull(_cursorIndexOfBlog)) {
              _tmpBlog = null;
            } else {
              _tmpBlog = _cursor.getString(_cursorIndexOfBlog);
            }
            final String _tmpSubscriptions_url;
            if (_cursor.isNull(_cursorIndexOfSubscriptionsUrl)) {
              _tmpSubscriptions_url = null;
            } else {
              _tmpSubscriptions_url = _cursor.getString(_cursorIndexOfSubscriptionsUrl);
            }
            final String _tmpUpdate_at;
            if (_cursor.isNull(_cursorIndexOfUpdateAt)) {
              _tmpUpdate_at = null;
            } else {
              _tmpUpdate_at = _cursor.getString(_cursorIndexOfUpdateAt);
            }
            final Boolean _tmpSite_admin;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfSiteAdmin)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfSiteAdmin);
            }
            _tmpSite_admin = _tmp == null ? null : _tmp != 0;
            final String _tmpCompany;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmpCompany = null;
            } else {
              _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpPublic_repos;
            if (_cursor.isNull(_cursorIndexOfPublicRepos)) {
              _tmpPublic_repos = null;
            } else {
              _tmpPublic_repos = _cursor.getInt(_cursorIndexOfPublicRepos);
            }
            final String _tmpGravatar_id;
            if (_cursor.isNull(_cursorIndexOfGravatarId)) {
              _tmpGravatar_id = null;
            } else {
              _tmpGravatar_id = _cursor.getString(_cursorIndexOfGravatarId);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpOrganizations_url;
            if (_cursor.isNull(_cursorIndexOfOrganizationsUrl)) {
              _tmpOrganizations_url = null;
            } else {
              _tmpOrganizations_url = _cursor.getString(_cursorIndexOfOrganizationsUrl);
            }
            final String _tmpHireable;
            if (_cursor.isNull(_cursorIndexOfHireable)) {
              _tmpHireable = null;
            } else {
              _tmpHireable = _cursor.getString(_cursorIndexOfHireable);
            }
            final String _tmpStarred_url;
            if (_cursor.isNull(_cursorIndexOfStarredUrl)) {
              _tmpStarred_url = null;
            } else {
              _tmpStarred_url = _cursor.getString(_cursorIndexOfStarredUrl);
            }
            final String _tmpFollowers_url;
            if (_cursor.isNull(_cursorIndexOfFollowersUrl)) {
              _tmpFollowers_url = null;
            } else {
              _tmpFollowers_url = _cursor.getString(_cursorIndexOfFollowersUrl);
            }
            final Integer _tmpPublic_gists;
            if (_cursor.isNull(_cursorIndexOfPublicGists)) {
              _tmpPublic_gists = null;
            } else {
              _tmpPublic_gists = _cursor.getInt(_cursorIndexOfPublicGists);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpReceived_events_url;
            if (_cursor.isNull(_cursorIndexOfReceivedEventsUrl)) {
              _tmpReceived_events_url = null;
            } else {
              _tmpReceived_events_url = _cursor.getString(_cursorIndexOfReceivedEventsUrl);
            }
            final Integer _tmpFollowers;
            if (_cursor.isNull(_cursorIndexOfFollowers)) {
              _tmpFollowers = null;
            } else {
              _tmpFollowers = _cursor.getInt(_cursorIndexOfFollowers);
            }
            final String _tmpAvatar_url;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatar_url = null;
            } else {
              _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final String _tmpEvents_url;
            if (_cursor.isNull(_cursorIndexOfEventsUrl)) {
              _tmpEvents_url = null;
            } else {
              _tmpEvents_url = _cursor.getString(_cursorIndexOfEventsUrl);
            }
            final String _tmpHtml_url;
            if (_cursor.isNull(_cursorIndexOfHtmlUrl)) {
              _tmpHtml_url = null;
            } else {
              _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
            }
            final Integer _tmpFollowing;
            if (_cursor.isNull(_cursorIndexOfFollowing)) {
              _tmpFollowing = null;
            } else {
              _tmpFollowing = _cursor.getInt(_cursorIndexOfFollowing);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final boolean _tmpIsFav;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFav);
            _tmpIsFav = _tmp_1 != 0;
            _result = new UserEntity(_tmpGists_url,_tmpRepos_url,_tmpFollowing_url,_tmpTwitter_username,_tmpBio,_tmpCreated_at,_tmpLogin,_tmpType,_tmpBlog,_tmpSubscriptions_url,_tmpUpdate_at,_tmpSite_admin,_tmpCompany,_tmpId,_tmpPublic_repos,_tmpGravatar_id,_tmpEmail,_tmpOrganizations_url,_tmpHireable,_tmpStarred_url,_tmpFollowers_url,_tmpPublic_gists,_tmpUrl,_tmpReceived_events_url,_tmpFollowers,_tmpAvatar_url,_tmpEvents_url,_tmpHtml_url,_tmpFollowing,_tmpName,_tmpLocation,_tmpNode_id,_tmpIsFav);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FollowersEntity>> getAllFollowers(final int id) {
    final String _sql = "SELECT * FROM followers WHERE user_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"followers"}, new Callable<List<FollowersEntity>>() {
      @Override
      public List<FollowersEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfGistsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "gists_url");
          final int _cursorIndexOfReposUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "repos_url");
          final int _cursorIndexOfFollowingUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "following_url");
          final int _cursorIndexOfStarredUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "starred_url");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfFollowersUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "followers_url");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfSubscriptionsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptions_url");
          final int _cursorIndexOfReceivedEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "receivedEvents_url");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "events_url");
          final int _cursorIndexOfHtmlUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "html_url");
          final int _cursorIndexOfSiteAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "site_admin");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGravatarId = CursorUtil.getColumnIndexOrThrow(_cursor, "gravatar_id");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "node_id");
          final int _cursorIndexOfOrganizationsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "organizations_url");
          final List<FollowersEntity> _result = new ArrayList<FollowersEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FollowersEntity _item;
            final Integer _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getInt(_cursorIndexOfUserId);
            }
            final String _tmpGists_url;
            if (_cursor.isNull(_cursorIndexOfGistsUrl)) {
              _tmpGists_url = null;
            } else {
              _tmpGists_url = _cursor.getString(_cursorIndexOfGistsUrl);
            }
            final String _tmpRepos_url;
            if (_cursor.isNull(_cursorIndexOfReposUrl)) {
              _tmpRepos_url = null;
            } else {
              _tmpRepos_url = _cursor.getString(_cursorIndexOfReposUrl);
            }
            final String _tmpFollowing_url;
            if (_cursor.isNull(_cursorIndexOfFollowingUrl)) {
              _tmpFollowing_url = null;
            } else {
              _tmpFollowing_url = _cursor.getString(_cursorIndexOfFollowingUrl);
            }
            final String _tmpStarred_url;
            if (_cursor.isNull(_cursorIndexOfStarredUrl)) {
              _tmpStarred_url = null;
            } else {
              _tmpStarred_url = _cursor.getString(_cursorIndexOfStarredUrl);
            }
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpFollowers_url;
            if (_cursor.isNull(_cursorIndexOfFollowersUrl)) {
              _tmpFollowers_url = null;
            } else {
              _tmpFollowers_url = _cursor.getString(_cursorIndexOfFollowersUrl);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpSubscriptions_url;
            if (_cursor.isNull(_cursorIndexOfSubscriptionsUrl)) {
              _tmpSubscriptions_url = null;
            } else {
              _tmpSubscriptions_url = _cursor.getString(_cursorIndexOfSubscriptionsUrl);
            }
            final String _tmpReceivedEvents_url;
            if (_cursor.isNull(_cursorIndexOfReceivedEventsUrl)) {
              _tmpReceivedEvents_url = null;
            } else {
              _tmpReceivedEvents_url = _cursor.getString(_cursorIndexOfReceivedEventsUrl);
            }
            final String _tmpAvatar_url;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatar_url = null;
            } else {
              _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final String _tmpEvents_url;
            if (_cursor.isNull(_cursorIndexOfEventsUrl)) {
              _tmpEvents_url = null;
            } else {
              _tmpEvents_url = _cursor.getString(_cursorIndexOfEventsUrl);
            }
            final String _tmpHtml_url;
            if (_cursor.isNull(_cursorIndexOfHtmlUrl)) {
              _tmpHtml_url = null;
            } else {
              _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
            }
            final Boolean _tmpSite_admin;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfSiteAdmin)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfSiteAdmin);
            }
            _tmpSite_admin = _tmp == null ? null : _tmp != 0;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpGravatar_id;
            if (_cursor.isNull(_cursorIndexOfGravatarId)) {
              _tmpGravatar_id = null;
            } else {
              _tmpGravatar_id = _cursor.getString(_cursorIndexOfGravatarId);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final String _tmpOrganizations_url;
            if (_cursor.isNull(_cursorIndexOfOrganizationsUrl)) {
              _tmpOrganizations_url = null;
            } else {
              _tmpOrganizations_url = _cursor.getString(_cursorIndexOfOrganizationsUrl);
            }
            _item = new FollowersEntity(_tmpUser_id,_tmpGists_url,_tmpRepos_url,_tmpFollowing_url,_tmpStarred_url,_tmpLogin,_tmpFollowers_url,_tmpType,_tmpUrl,_tmpSubscriptions_url,_tmpReceivedEvents_url,_tmpAvatar_url,_tmpEvents_url,_tmpHtml_url,_tmpSite_admin,_tmpId,_tmpGravatar_id,_tmpNode_id,_tmpOrganizations_url);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FollowingEntity>> getAllFollowing(final int id) {
    final String _sql = "SELECT * FROM following WHERE user_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"following"}, new Callable<List<FollowingEntity>>() {
      @Override
      public List<FollowingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfGistsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "gists_url");
          final int _cursorIndexOfReposUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "repos_url");
          final int _cursorIndexOfFollowingUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "following_url");
          final int _cursorIndexOfStarredUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "starred_url");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfFollowersUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "followers_url");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfSubscriptionsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptions_url");
          final int _cursorIndexOfReceivedEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "receivedEvents_url");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfEventsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "events_url");
          final int _cursorIndexOfHtmlUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "html_url");
          final int _cursorIndexOfSiteAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "site_admin");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGravatarId = CursorUtil.getColumnIndexOrThrow(_cursor, "gravatar_id");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "node_id");
          final int _cursorIndexOfOrganizationsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "organizations_url");
          final List<FollowingEntity> _result = new ArrayList<FollowingEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FollowingEntity _item;
            final Integer _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getInt(_cursorIndexOfUserId);
            }
            final String _tmpGists_url;
            if (_cursor.isNull(_cursorIndexOfGistsUrl)) {
              _tmpGists_url = null;
            } else {
              _tmpGists_url = _cursor.getString(_cursorIndexOfGistsUrl);
            }
            final String _tmpRepos_url;
            if (_cursor.isNull(_cursorIndexOfReposUrl)) {
              _tmpRepos_url = null;
            } else {
              _tmpRepos_url = _cursor.getString(_cursorIndexOfReposUrl);
            }
            final String _tmpFollowing_url;
            if (_cursor.isNull(_cursorIndexOfFollowingUrl)) {
              _tmpFollowing_url = null;
            } else {
              _tmpFollowing_url = _cursor.getString(_cursorIndexOfFollowingUrl);
            }
            final String _tmpStarred_url;
            if (_cursor.isNull(_cursorIndexOfStarredUrl)) {
              _tmpStarred_url = null;
            } else {
              _tmpStarred_url = _cursor.getString(_cursorIndexOfStarredUrl);
            }
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpFollowers_url;
            if (_cursor.isNull(_cursorIndexOfFollowersUrl)) {
              _tmpFollowers_url = null;
            } else {
              _tmpFollowers_url = _cursor.getString(_cursorIndexOfFollowersUrl);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpSubscriptions_url;
            if (_cursor.isNull(_cursorIndexOfSubscriptionsUrl)) {
              _tmpSubscriptions_url = null;
            } else {
              _tmpSubscriptions_url = _cursor.getString(_cursorIndexOfSubscriptionsUrl);
            }
            final String _tmpReceivedEvents_url;
            if (_cursor.isNull(_cursorIndexOfReceivedEventsUrl)) {
              _tmpReceivedEvents_url = null;
            } else {
              _tmpReceivedEvents_url = _cursor.getString(_cursorIndexOfReceivedEventsUrl);
            }
            final String _tmpAvatar_url;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatar_url = null;
            } else {
              _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final String _tmpEvents_url;
            if (_cursor.isNull(_cursorIndexOfEventsUrl)) {
              _tmpEvents_url = null;
            } else {
              _tmpEvents_url = _cursor.getString(_cursorIndexOfEventsUrl);
            }
            final String _tmpHtml_url;
            if (_cursor.isNull(_cursorIndexOfHtmlUrl)) {
              _tmpHtml_url = null;
            } else {
              _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
            }
            final Boolean _tmpSite_admin;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfSiteAdmin)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfSiteAdmin);
            }
            _tmpSite_admin = _tmp == null ? null : _tmp != 0;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpGravatar_id;
            if (_cursor.isNull(_cursorIndexOfGravatarId)) {
              _tmpGravatar_id = null;
            } else {
              _tmpGravatar_id = _cursor.getString(_cursorIndexOfGravatarId);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final String _tmpOrganizations_url;
            if (_cursor.isNull(_cursorIndexOfOrganizationsUrl)) {
              _tmpOrganizations_url = null;
            } else {
              _tmpOrganizations_url = _cursor.getString(_cursorIndexOfOrganizationsUrl);
            }
            _item = new FollowingEntity(_tmpUser_id,_tmpGists_url,_tmpRepos_url,_tmpFollowing_url,_tmpStarred_url,_tmpLogin,_tmpFollowers_url,_tmpType,_tmpUrl,_tmpSubscriptions_url,_tmpReceivedEvents_url,_tmpAvatar_url,_tmpEvents_url,_tmpHtml_url,_tmpSite_admin,_tmpId,_tmpGravatar_id,_tmpNode_id,_tmpOrganizations_url);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
