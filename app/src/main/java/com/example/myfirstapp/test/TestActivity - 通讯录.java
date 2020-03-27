//package com.example.myfirstapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.Manifest;
//import android.content.Context;
//import android.database.Cursor;
//import android.os.Bundle;
//import android.provider.ContactsContract;
//import android.util.Log;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//
//import com.tbruyelle.rxpermissions.RxPermissions;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import rx.functions.Action1;
//
//public class TestActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//        getUserContact();
//
//
//    }
//
//    public void getUserContact(){
//        System.out.println("000");
//        RxPermissions.getInstance(TestActivity.this)
//            .request(Manifest.permission.READ_CONTACTS)
//            .subscribe(new Action1<Boolean>() {
//            @Override
//            public void call(Boolean aBoolean) {
//                if (aBoolean) {//true表示获取权限成功（在android6.0以下默认为true）
//                    Log.i("permissions", "Manifest.permission.READ_CONTACTS" + "：" + "获取成功");
//                    getAllContacts(TestActivity.this);
//                } else {
//                    Log.i("permissions", "Manifest.permission.READ_CONTACTS" + "：" + "获取失败");
//                }
//
//            }
//        });
//    }
//
////    private void testOther(Boolean aBooleans){
//    public void getAllContacts(Context context) {
////        ArrayList<MyContacts> contacts = new ArrayList<MyContacts>();
//        List<Map<String, Object>> contacts = new ArrayList<Map<String, Object>>();
//
//        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
//
//        while (cursor.moveToNext()) {
//            Map<String, Object> temp = new HashMap<String, Object>();
////            MyContacts temp = new MyContacts();
//            String contactId = cursor.getString(cursor
//                    .getColumnIndex(ContactsContract.Contacts._ID));
//            //获取联系人姓名
//            String name = cursor.getString(cursor
//                    .getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
////            temp.name = name;
//            temp.put("name", name);
//
//            //获取联系人电话号码
//            Cursor phoneCursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
//                    null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + contactId, null, null);
//
//            while (phoneCursor.moveToNext()) {
//                String phone = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
//                phone = phone.replace("-", "");
//                phone = phone.replace(" ", "");
////                temp.phone = phone;
//                temp.put("phone", phone);
//            }
//
//            //获取联系人备注信息
//            Cursor noteCursor = context.getContentResolver().query(
//                    ContactsContract.Data.CONTENT_URI,
//                    new String[]{ContactsContract.Data._ID, ContactsContract.CommonDataKinds.Nickname.NAME},
//                    ContactsContract.Data.CONTACT_ID + "=?" + " AND " + ContactsContract.Data.MIMETYPE + "='"
//                            + ContactsContract.CommonDataKinds.Nickname.CONTENT_ITEM_TYPE + "'",
//                    new String[]{contactId}, null);
//            if (noteCursor.moveToFirst()) {
//                do {
//                    String note = noteCursor.getString(noteCursor
//                            .getColumnIndex(ContactsContract.CommonDataKinds.Nickname.NAME));
////                    temp.note = note;
//                    temp.put("note", note);
//                    Log.i("note:", note);
//                } while (noteCursor.moveToNext());
//            }
//            if (!name.contains("恒安")) {
//                contacts.add(temp);
//            }
//            //记得要把cursor给close掉
//            phoneCursor.close();
//            noteCursor.close();
//        }
//
//        SimpleAdapter myAdapter = new SimpleAdapter(context.getApplicationContext(), (List<Map<String, Object>>) contacts, R.layout.contact_item, new String[]{"name", "phone", "note"}, new int[]{R.id.name, R.id.phone, });
//        System.out.println(myAdapter.getCount());
//        ListView listView = (ListView) findViewById(R.id.listView);
//        listView.setAdapter(myAdapter);
//    }
//}
//






//2020-03-26 https://www.runoob.com/w3cnote/android-tutorial-adapter.html