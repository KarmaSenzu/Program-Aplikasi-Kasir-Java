package com.mycompany.oishine;

public class OishiNe {

   public String paket,makan,minum,mnm,layan;

   public int jml_mkn, jml_mnm;

   public double hrg_mkn, hrg_mnm,biaya,ub,uk, ttl, total, ttlbyr;

   

   public void setPaket ( String val )

   { paket=val; }

   public String getPaket()

   { return paket; }    

   public void setPilihPaket ()

   { if (paket.equalsIgnoreCase("PAKET 1"))

       { makan="AYAM + NASI + 2 TELUR DADAR";

         hrg_mkn=15000; }

     else if (paket.equalsIgnoreCase("PAKET 2"))

       { makan="BEEF TERIYAKI , NASI , SALAD , 3 TELUR CEPLOK ";

         hrg_mkn=20000; }

     else if (paket.equalsIgnoreCase("PAKET 3"))

       { makan="SMOKE BEEF, 2 NASI , 2 TELUR BALADO , DESSERT";

         hrg_mkn=30000; }

     else

       { makan="";

         hrg_mkn=0; } }

   public void setMakan(String val)

   { makan=val; }

   public String getMakan()

   { return makan; }

   public void setHrgMkn(Double val)

   { hrg_mkn=val; }

   public double getHrgMkn()

   { return hrg_mkn; }

   public void setJmlMkn(Integer val)

   { jml_mkn=val; }

   public int getJmlMkn()

   { return jml_mkn; }

  

   public void setMinum (String val)

   { minum=val; }

   public String getMinum()

   { return minum; }

   public void setPilihMinum()

   { if ( minum.equalsIgnoreCase("AQUA BOTOL"))

       { hrg_mnm=1000; }

     else if ( minum.equalsIgnoreCase("JUS APEL"))

       { hrg_mnm=5000; }
     else if ( minum.equalsIgnoreCase("JUS JERUK"))

       { hrg_mnm=5000; }
     else if ( minum.equalsIgnoreCase("JUS MANGGA"))

       { hrg_mnm=5000; }

     else if ( minum.equalsIgnoreCase("ES TEH MANIS"))

       { hrg_mnm=2500; }

     else { hrg_mnm=0; } }

   public void setHrgMnm(Double val)

   { hrg_mnm=val; }

   public double getHrgMnm()

   { return hrg_mnm; }

   public void setJmlMnm(Integer val)

   { jml_mnm=val; }

   public int getJmlMnm()

   { return jml_mnm; }

  

   public void setLayan(String val)

    { layan = val; }

    public String getLayan()

    { return layan; }

    public void setSeleksiLayan()

    { if (layan.equalsIgnoreCase("Take A Way"))

       { biaya=0; }

    else if (layan.equalsIgnoreCase("Delivery"))

       { biaya=((hrg_mkn*jml_mkn)+(hrg_mnm*jml_mnm))*0.1; 
       }

    else { biaya=0; }

    }

    public void setBiaya(Double val)

    { biaya=val; }

    public double getBiaya()

    { return biaya; }

  

    public void setTtl(Double val)

    { ttl=val; }

    public double getTtl()

    { return (hrg_mkn*jml_mkn); }

   

    public void setTotal(Double val)

    { total=val; }

    public double getTotal()

    { return ((hrg_mkn*jml_mkn)+(hrg_mnm*jml_mnm)); }

   

    public void setTtl_byr(Double val)

    { ttlbyr=val; }

    public double getTtl_byr()

    { ttlbyr=(hrg_mkn*jml_mkn)+(hrg_mnm*jml_mnm)+biaya;

      return (ttlbyr); }

   

    public void setUb(Double val)

    { ub=val; }

    public double getUb()

    { return ub; }

    public double getUk()

    { uk=ub-ttlbyr;

      return uk; }
    
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormOishiNe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOishiNe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOishiNe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOishiNe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOishiNe().setVisible(true);
            }
        });
    }

}
