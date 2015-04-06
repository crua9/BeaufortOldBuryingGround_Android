package com.siliconorchard;

import java.util.ArrayList;

import com.ironsource.mobilcore.MobileCore;
import com.ironsource.mobilcore.MobileCore.AD_UNITS;
import com.ironsource.mobilcore.MobileCore.LOG_TYPE;
import com.ironsource.mobilcore.OnReadyListener;
import com.siliconorchard.client.image.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ImageActivity extends Activity{
	
	ArrayList<Place> placelist = null;
	Context c =null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Initialize();
		
	 c = this;
	 MobileCore.init(this,"6D2V2SBRCUOD79N4BZN3Q7U4XL1K9", LOG_TYPE.DEBUG, AD_UNITS.ALL_UNITS);
	//	MobileCore.getSlider().setContentViewWithSlider(this, R.layout.map);
		// Look up the AdView as a resource and load a request.
		 MobileCore.setStickeezReadyListener(new OnReadyListener()
		 { @Override 
			 public void onReady(AD_UNITS adUnit) {
			 if (adUnit.equals(AD_UNITS.STICKEEZ)){
				 //do something 
				 MobileCore.showStickee((Activity) c);
		 }
		 } }
		 );
		 MobileCore.showStickee(this);
	//	setContentView(w)
		AlertDialog levelDialog;
		final CharSequence[] items = { "Go to the map", "Directions", "About this app" };
		
		// Creating and Building the Dialog
		AlertDialog.Builder builder = new AlertDialog.Builder(c);
		builder.setTitle("View As");
		builder.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
		builder.setSingleChoiceItems(items, -1,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int item) {

						switch (item) {
						case 0:
							dialog.dismiss();
							// Your code when first option seletced
							break;
						case 1:
							String s ="http://maps.google.com/maps?q=34.718167,-76.664088";
							
								Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
								startActivity(browserIntent);	
								dialog.dismiss();
							break;
						case 2:
							
							startActivity(new Intent(c, Contact.class));
							dialog.dismiss();
							// Your code when 3rd option seletced
							break;
					

						}
						dialog.dismiss();
					}
				});
		levelDialog = builder.create();
		levelDialog.show();
		
		
		
		WebView w = new WebView(this);//(WebView)findViewById(R.id.webview1);
		w.getSettings().setBuiltInZoomControls(true);
		w.getSettings().setDisplayZoomControls(true);
		w.getSettings().setLoadWithOverviewMode(true);
		w.getSettings().setSupportZoom(true);
	
		w.getSettings().setUseWideViewPort(true);
		w.loadUrl("file:///android_asset/bd.html");
		
		w.setWebViewClient(new WebViewClient(){
			
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				String s = url.replace("http://www.", "").replace(".com/","");
				AlertDialog.Builder builder = new AlertDialog.Builder(c);
				
				AlertDialog alertDialog = builder.create();
				
				
				 alertDialog.setButton(Dialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
				});
				
				
				
				int i =Integer.parseInt(s);
				switch (i) {
				case 1:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text1));
					alertDialog.show();
					break;
				case 2:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text2));
					alertDialog.show();
					break;
				case 3:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text3));
					alertDialog.show();
					break;
				case 4:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text4));
					alertDialog.show();
					break;
				case 5:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text5));
					alertDialog.show();
					break;
				case 6:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text6));
					alertDialog.show();
					break;
					
				case 7:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text7));
					alertDialog.show();
					break;
				case 8:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text8));
					alertDialog.show();
					break;
				case 9:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text9));
					alertDialog.show();
					break;
				case 10:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text10));
					alertDialog.show();
					break;
				case 11:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text11));
					alertDialog.show();
					break;
				case 12:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text12));
					alertDialog.show();
					break;
				case 13:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text13));
					alertDialog.show();
					break;
				case 14:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text14));
					alertDialog.show();
					break;
				case 15:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text15));
					alertDialog.show();
					break;
				case 16:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text16));
					alertDialog.show();
					break;
				case 17:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text17));
					alertDialog.show();
					break;
				case 18:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text18));
					alertDialog.show();
					break;
				case 19:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text19));
					alertDialog.show();
					break;
				case 20:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text20));
					alertDialog.show();
					break;
				case 21:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text21));
					alertDialog.show();
					break;
				case 22:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text22));
					alertDialog.show();
					break;
				case 23:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text23));
					alertDialog.show();
					break;
				case 24:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text24));
					alertDialog.show();
					break;
				case 25:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text25));
					alertDialog.show();
					break;
				case 26:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text26));
					alertDialog.show();
					break;
				case 27:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text27));
					alertDialog.show();
					break;
				case 28:
					alertDialog.setTitle(s);
					alertDialog.setMessage(getResources().getString(R.string.text28));
					alertDialog.show();
					break;
					

				default:
					break;
				}
				
				
				return true;
			}
		});
		
		;
		setContentView(w);
	/*	Point p = new Point();
		getWindowManager().getDefaultDisplay().getSize(p);
		Log.d("kd", p.x+ " "+p.y);
		PanZoomView.ratio = (p.x*10)/p.y;
	//	MyImageView myimg = new MyImageView(this);
		PanZoomView z = new PanZoomView(this);
		z.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.a));
		setContentView(z);*/
	}
	private void Initialize() {
		// TODO Auto-generated method stub
		
		placelist = new ArrayList<Place>();
		
		Place p =new Place();
		p.Number=1;
		p.x=(double) 1638;
		p.y=(double) 1263;
		placelist.add(p);
		
		
		//////////////
		
	                 int id=1;// Circle  coords="728,2228,50" 
						 id=2;// Circle  coords="967,2140,50" 
						 id=3;// Circle  coords="635,1720,50" 
						 id=4;// Circle  coords="813,1368,50" 
						 id=5;// Circle  coords="901,1384,50" 
						 id=6;// Circle  coords="753,1191,50" 
						 id=7;// Circle  coords="900,1070,50" 
						 id=8;// Circle  coords="990,1130,50" 
						 id=9;// Circle  coords="960,960,50" 
						 id=10;// Circle  coords="1070,1100,50" 
						 id=11;// Circle  coords="1150,1180,50" 
						 id=12;// Circle  coords="1385,1120,50" 
						 id=13;// Circle  coords="1267,1018,50" 
						 id=14;// Circle  coords="973,840,50" 
						 id=15;// Circle  coords="1040,760,50" 
						 id=16;// Circle  coords="1260,710,50" 
						 id=17;// Circle  coords="1133,642,50" 
						 id=18;// Circle  coords="1165,550,50" 
						 id=19;// Circle  coords="1340,380,50" 
						 id=20;// Circle  coords="1485,380,50" 
						 id=21;// Circle  coords="1645,786,50" 
						 id=22;// Circle  coords="1850,1110,50" 
						 id=23;// Circle  coords="1900,1185,50" 
						 id=24;// Circle  coords="1925,1355,50" 
						 id=25;// Circle  coords="1640,1655,50" 
						 id=26;// Circle  coords="1500,1835,50" 
						 id=25;// Circle  coords="1060,1710,50" 
						 id=26;// Circle  coords="1390,2040,50" 
		
		//////////
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// toggle nav drawer on selecting action bar app icon/title
		
		// Handle action bar actions click
		switch (item.getItemId()) {
		case R.id.action_settings:
			final CharSequence[] items = { "Go to the map", "Directions", "About this app" };
			AlertDialog levelDialog;
			AlertDialog.Builder builder = new AlertDialog.Builder(c);
			builder.setTitle("View As");
			builder.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
			builder.setSingleChoiceItems(items, -1,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int item) {

							switch (item) {
							case 0:
								dialog.dismiss();
								// Your code when first option seletced
								break;
							case 1:
								String s ="http://maps.google.com/maps?q=34.718167,-76.664088";
								
									Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
									startActivity(browserIntent);	
									dialog.dismiss();
								break;
							case 2:
								startActivity(new Intent(c, Contact.class));
								dialog.dismiss();
								// Your code when 3rd option seletced
								break;
						

							}
							dialog.dismiss();
						}
					});
			levelDialog = builder.create();
			levelDialog.show();
			return true;
		
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
