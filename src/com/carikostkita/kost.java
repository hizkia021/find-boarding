package com.carikostkita;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kost extends ListActivity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		String[] menulokasi = new String[]{"Meruya Place","Afifah","Belmont","Nine","Griya Topaz","Acika Meruya","Rumah9","Agsana","Bangawan Shop House","Bee House Residence","Bijak Palmerah","Brokoli House","Casah","Duta Raya","Enam Enam Tiga","Gili Residence","Glory Mansion","Gracia","Grand Palace","Grand Residence","Griya","Homey Residence","Ibu Marni","Kamboja Ujung Raya","Kelapa Dua Raya","Kelik","Klatinung","Komplek BPK","Lisanda Home","Mandiri","Palapa","Palm","Palmerah 75 Residence","Permata","Pinkostel","Pondok Mandala","Putri","Rabel","Rawa Bahagia","Rumah","Sabigi","Sembilan Sembilan","Slipi","Stars","Susilo","Tanjung Duren","Tiga Lima","Tiga Sembilan","Tiga Tujuh"};
		
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menulokasi));
	}
	
	//defenisi untuk handle array di click
	protected void onListItemClick(ListView l,View v,int position,long id)
	{
		super.onListItemClick(l, v, position, id);
		// menangkap string yang click
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		tampilkanpilihan(pilihan);
		
	}

	private void tampilkanpilihan(String pilihan) {
		// TODO Auto-generated method stub
		try 
		{
			Intent i = null;
			if(pilihan.equals("Meruya Place")) 
			{
			   i = new Intent (this,kostmeruyaplace.class);
			}
			if(pilihan.equals("Afifah")) 
			{
			   i = new Intent (this,kostafifah.class);
			}
			if(pilihan.equals("Belmont")) 
			{
			   i = new Intent (this,kostbelmont.class);
			}
			if(pilihan.equals("Nine")) 
			{
			   i = new Intent (this,kostnine.class);
			}
			if(pilihan.equals("Griya Topaz")) 
			{
			   i = new Intent (this,kostgriyatopaz.class);
			}
			if(pilihan.equals("Acika Meruya")) 
			{
			   i = new Intent (this,kostacikameruya.class);
			}
			if(pilihan.equals("Rumah9")) 
			{
			   i = new Intent (this,kostrumah9.class);
			}
			if(pilihan.equals("Agsana")) 
			{
			   i = new Intent (this,kostagsana.class);
			}
			if(pilihan.equals("Bangawan Shop House")) 
			{
			   i = new Intent (this,kostbangawanshophouse.class);
			}
			if(pilihan.equals("Bee House Residence")) 
			{
			   i = new Intent (this,kostbeehouseresidence.class);
			}
			if(pilihan.equals("Bijak Palmerah")) 
			{
			   i = new Intent (this,kostbijakpalmerah.class);
			}
			if(pilihan.equals("Brokoli House")) 
			{
			   i = new Intent (this,kostbrokolihouse.class);
			}
			if(pilihan.equals("Casah")) 
			{
			   i = new Intent (this,kostcasah.class);
			}
			if(pilihan.equals("Duta Raya")) 
			{
			   i = new Intent (this,kostdutaraya.class);
			}
			if(pilihan.equals("Enam Enam Tiga")) 
			{
			   i = new Intent (this,kostenamenamtiga.class);
			}
			if(pilihan.equals("Gili Residence")) 
			{
			   i = new Intent (this,kostgiliresidence.class);
			}
			if(pilihan.equals("Glory Mansion")) 
			{
			   i = new Intent (this,kostglorymansion.class);
			}
			if(pilihan.equals("Gracia")) 
			{
			   i = new Intent (this,kostgracia.class);
			}
			if(pilihan.equals("Grand Palace")) 
			{
			   i = new Intent (this,kostgrandpalace.class);
			}
			if(pilihan.equals("Grand Residence")) 
			{
			   i = new Intent (this,kostgrandresidence.class);
			}
			if(pilihan.equals("Griya")) 
			{
			   i = new Intent (this,kostgriya.class);
			}
			if(pilihan.equals("Homey Residence")) 
			{
			   i = new Intent (this,kosthomeyresidence.class);
			}
			if(pilihan.equals("Ibu Marni")) 
			{
			   i = new Intent (this,kostibumarni.class);
			}
			if(pilihan.equals("Kamboja Ujung Raya")) 
			{
			   i = new Intent (this,kostkambojaujungraya.class);
			}
			if(pilihan.equals("Kelapa Dua Raya")) 
			{
			   i = new Intent (this,kostkelapaduaraya.class);
			}
			if(pilihan.equals("Kelik")) 
			{
			   i = new Intent (this,kostkelik.class);
			}
			if(pilihan.equals("Klatinung")) 
			{
			   i = new Intent (this,kostklatinung.class);
			}
			if(pilihan.equals("Komplek BPK")) 
			{
			   i = new Intent (this,kostkomplekbpk.class);
			}
			if(pilihan.equals("Lisanda Home")) 
			{
			   i = new Intent (this,kostlisandahome.class);
			}
			if(pilihan.equals("Mandiri")) 
			{
			   i = new Intent (this,kostmandiri.class);
			}
			if(pilihan.equals("Palapa")) 
			{
			   i = new Intent (this,kostpalapa.class);
			}
			if(pilihan.equals("Palm")) 
			{
			   i = new Intent (this,kostpalm.class);
			}
			if(pilihan.equals("Palmerah 75 Residence")) 
			{
			   i = new Intent (this,kostpalmerah75residence.class);
			}
			if(pilihan.equals("Permata")) 
			{
			   i = new Intent (this,kostpermata.class);
			}
			if(pilihan.equals("Pinkostel")) 
			{
			   i = new Intent (this,kostpinkostel.class);
			}
			if(pilihan.equals("Pondok Mandala")) 
			{
			   i = new Intent (this,kostpondokmandala.class);
			}
			if(pilihan.equals("Putri")) 
			{
			   i = new Intent (this,kostputri.class);
			}
			if(pilihan.equals("Rabel")) 
			{
			   i = new Intent (this,kostrabel.class);
			}
			if(pilihan.equals("Rawa Bahagia")) 
			{
			   i = new Intent (this,kostrawabahagia.class);
			}
			if(pilihan.equals("Rumah")) 
			{
			   i = new Intent (this,kostrumah.class);
			}
			if(pilihan.equals("Sabigi")) 
			{
			   i = new Intent (this,kostsabigi.class);
			}
			if(pilihan.equals("Sembilan Sembilan")) 
			{
			   i = new Intent (this,kostsembilansembilan.class);
			}
			if(pilihan.equals("Slipi")) 
			{
			   i = new Intent (this,kostslipi.class);
			}
			if(pilihan.equals("Stars")) 
			{
			   i = new Intent (this,koststars.class);
			}
			if(pilihan.equals("Susilo")) 
			{
			   i = new Intent (this,kostsusilo.class);
			}
			if(pilihan.equals("Tanjung Duren")) 
			{
			   i = new Intent (this,kosttanjungduren.class);
			}
			if(pilihan.equals("Tiga Lima")) 
			{
			   i = new Intent (this,kosttigalima.class);
			}
			if(pilihan.equals("Tiga Sembilan")) 
			{
			   i = new Intent (this,kosttigasembilan.class);
			}
			if(pilihan.equals("Tiga Tujuh")) 
			{
			   i = new Intent (this,kosttigatujuh.class);
			}
			
			
			startActivity(i);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
