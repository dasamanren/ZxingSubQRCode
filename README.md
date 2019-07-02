# ZxingSubQRCode

二维码精简版 (只包含生成二维码)
EncodingUtils --- 创建二维码工具类

此项目是library包,没有demo

代码来自zxing 3.3.0版本

集成后直接使用EncodingUtils 来生成二维码就可以了,其中包括带logo的二维码生成

简单用例

1.在 buld.gradle 中添加依赖
```
compile 'com.dasamanren1:zxingsubqrcode:1.0.0'
```
或者
```
compile 'com.dasamanren1:zxingsubqrcode:1.0.0@aar'
```
2.生成二维码
```
自带白边
Bitmap bitmap = EncodingUtils.createQRCode(content, size, size, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_logo));

margin是白边的距离,默认-1, 设置为0时充满无白边
Bitmap bitmap = EncodingUtils.createQRCode(content, size, size, margin, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_logo));
```
