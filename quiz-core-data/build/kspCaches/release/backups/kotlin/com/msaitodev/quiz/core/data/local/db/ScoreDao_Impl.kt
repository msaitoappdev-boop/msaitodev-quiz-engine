package com.msaitodev.quiz.core.`data`.local.db

import android.database.Cursor
import androidx.room.CoroutinesRoom
import androidx.room.EntityInsertionAdapter
import androidx.room.RoomDatabase
import androidx.room.RoomSQLiteQuery
import androidx.room.RoomSQLiteQuery.Companion.acquire
import androidx.room.SharedSQLiteStatement
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.query
import androidx.sqlite.db.SupportSQLiteStatement
import java.lang.Class
import java.util.ArrayList
import java.util.concurrent.Callable
import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION"])
public class ScoreDao_Impl(
  __db: RoomDatabase,
) : ScoreDao {
  private val __db: RoomDatabase

  private val __insertionAdapterOfScoreRecord: EntityInsertionAdapter<ScoreRecord>

  private val __preparedStmtOfClear: SharedSQLiteStatement
  init {
    this.__db = __db
    this.__insertionAdapterOfScoreRecord = object : EntityInsertionAdapter<ScoreRecord>(__db) {
      protected override fun createQuery(): String =
          "INSERT OR REPLACE INTO `score_records` (`id`,`timestamp`,`score`,`total`,`percent`) VALUES (nullif(?, 0),?,?,?,?)"

      protected override fun bind(statement: SupportSQLiteStatement, entity: ScoreRecord) {
        statement.bindLong(1, entity.id)
        statement.bindLong(2, entity.timestamp)
        statement.bindLong(3, entity.score.toLong())
        statement.bindLong(4, entity.total.toLong())
        statement.bindLong(5, entity.percent.toLong())
      }
    }
    this.__preparedStmtOfClear = object : SharedSQLiteStatement(__db) {
      public override fun createQuery(): String {
        val _query: String = "DELETE FROM score_records"
        return _query
      }
    }
  }

  public override suspend fun insert(record: ScoreRecord): Unit = CoroutinesRoom.execute(__db, true,
      object : Callable<Unit> {
    public override fun call() {
      __db.beginTransaction()
      try {
        __insertionAdapterOfScoreRecord.insert(record)
        __db.setTransactionSuccessful()
      } finally {
        __db.endTransaction()
      }
    }
  })

  public override suspend fun clear(): Unit = CoroutinesRoom.execute(__db, true, object :
      Callable<Unit> {
    public override fun call() {
      val _stmt: SupportSQLiteStatement = __preparedStmtOfClear.acquire()
      try {
        __db.beginTransaction()
        try {
          _stmt.executeUpdateDelete()
          __db.setTransactionSuccessful()
        } finally {
          __db.endTransaction()
        }
      } finally {
        __preparedStmtOfClear.release(_stmt)
      }
    }
  })

  public override fun observeAll(): Flow<List<ScoreRecord>> {
    val _sql: String = "SELECT * FROM score_records ORDER BY timestamp DESC"
    val _statement: RoomSQLiteQuery = acquire(_sql, 0)
    return CoroutinesRoom.createFlow(__db, false, arrayOf("score_records"), object :
        Callable<List<ScoreRecord>> {
      public override fun call(): List<ScoreRecord> {
        val _cursor: Cursor = query(__db, _statement, false, null)
        try {
          val _cursorIndexOfId: Int = getColumnIndexOrThrow(_cursor, "id")
          val _cursorIndexOfTimestamp: Int = getColumnIndexOrThrow(_cursor, "timestamp")
          val _cursorIndexOfScore: Int = getColumnIndexOrThrow(_cursor, "score")
          val _cursorIndexOfTotal: Int = getColumnIndexOrThrow(_cursor, "total")
          val _cursorIndexOfPercent: Int = getColumnIndexOrThrow(_cursor, "percent")
          val _result: MutableList<ScoreRecord> = ArrayList<ScoreRecord>(_cursor.getCount())
          while (_cursor.moveToNext()) {
            val _item: ScoreRecord
            val _tmpId: Long
            _tmpId = _cursor.getLong(_cursorIndexOfId)
            val _tmpTimestamp: Long
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp)
            val _tmpScore: Int
            _tmpScore = _cursor.getInt(_cursorIndexOfScore)
            val _tmpTotal: Int
            _tmpTotal = _cursor.getInt(_cursorIndexOfTotal)
            val _tmpPercent: Int
            _tmpPercent = _cursor.getInt(_cursorIndexOfPercent)
            _item = ScoreRecord(_tmpId,_tmpTimestamp,_tmpScore,_tmpTotal,_tmpPercent)
            _result.add(_item)
          }
          return _result
        } finally {
          _cursor.close()
        }
      }

      protected fun finalize() {
        _statement.release()
      }
    })
  }

  public companion object {
    @JvmStatic
    public fun getRequiredConverters(): List<Class<*>> = emptyList()
  }
}
