# Shapeloading
自定义View  loading动画
根据 https://github.com/zzz40500/android-shapeLoadingView 改良版
### 2016-03-26 ##
 --> 添加Dialog cancel监听回调 调用方法:

	shapeLoadingDialog.setOnCancelListener(new DlalogCancelListener() {

			@Override
			public void onMyCancel(Dialog mDialog) {
				Log.d(TAG, "shapeLoadingDialog canceled");
			}
		});
    