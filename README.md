### MaterialRefreshLayout

---------------------------------------------------------------------------

[原文地址](https://github.com/android-cjj/Android-MaterialRefreshLayout)  
本文是转载，原文的不少BUG也也无人维护，作者推荐将`library`下载本地自己改，但为了不每次都拷贝，故自己维护使用。

### 用法
---------------------------------------------------------------------------

```
dependencies {
    compile 'sing.refreshLayout:library:1.0.2'
}
```

在`layout.xml`添加下面的代码：

```xml
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
      <...ListView or GridView or RecyclerView or ScrollView and more...>

</sing.MaterialRefreshLayout>
```
实例化它并设置监听，onrefresh是必须实现的，其他都是方法可选

```java
 materialRefreshLayout = (MaterialRefreshLayout) findViewById(R.id.refresh);
 materialRefreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
      @Override
      public void onRefresh(final MaterialRefreshLayout materialRefreshLayout) {
          //下拉刷新...
      }

       @Override
       public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
       	  //上拉刷新...
       }
  }

// 结束下拉刷新...
materialRefreshLayout.finishRefresh();
// 结束上拉刷新...
materialRefreshLayout.finishRefreshLoadMore();
```

----------------------------------------------
#### 1、侵入式下拉
在xml中, 设置以下属性

![](http://oupjofqw3.bkt.clouddn.com/material_refresh_layout_01.jpg?%20imageView2/1/w/320/h/300/format/jpg/q/75)

```XML
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:overlay="true"
    app:wave_show="false" >
```
在代码中是这样的：

```JAVA
materialRefreshLayout.setIsOverLay(true);
materialRefreshLayout.setWaveShow(false);
```
#### 2、非侵入下拉刷新

![](http://oupjofqw3.bkt.clouddn.com/material_refresh_layout_02.jpg)

在xml中, 设置以下属性

```XML
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:overlay="false"
    app:wave_show="false">
```
在代码中是这样的：

```JAVA
materialRefreshLayout.setIsOverLay(false);
materialRefreshLayout.setWaveShow(false);
```
#### 3、侵入式+波浪背景

![](http://oupjofqw3.bkt.clouddn.com/material_refresh_layout_03.jpg)

在xml中, 设置以下属性

```XML
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:overlay="true"
    app:wave_show="true"
    app:wave_color="#90ffffff"
    app:progress_colors="@array/material_colors"
    app:wave_height_type="higher">
```
在java代码中是这样的：

```JAVA
materialRefreshLayout.setWaveColor(0xf90fffff);
materialRefreshLayout.setIsOverLay(true);
materialRefreshLayout.setWaveShow(true);
```
#### 4、非侵入式+波浪背景

![](http://oupjofqw3.bkt.clouddn.com/material_refresh_layout_04.jpg)

在xml中, 设置以下属性

```XML
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:overlay="false"
    app:wave_show="true"
    app:wave_color="@color/material_green"
    app:wave_height_type="normal"  (higher) >
```
在java代码中是这样的：

```JAVA
materialRefreshLayout.setWaveColor(0xffffffff);
materialRefreshLayout.setIsOverLay(false);
materialRefreshLayout.setWaveShow(true);
```
#### 5、加载更多

![](http://oupjofqw3.bkt.clouddn.com/material_refresh_layout_05.jpg)

在xml中, 设置以下属性

```XML
<sing.MaterialRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:isLoadMore="true">
```
在java代码中是这样的：

```JAVA
materialRefreshLayout.setLoadMore(true);
```
### 6、自动下拉刷新

```JAVA
materialRefreshLayout.autoRefresh();
```
### 7、自动上拉刷新

```JAVA
materialRefreshLayout.autoRefreshLoadMore();
```

###
----------------------------------------------

### [v 1.0.2 修复记录](https://github.com/Sing1/MaterialRefreshLayout/blob/master/v1.0.2.md)
