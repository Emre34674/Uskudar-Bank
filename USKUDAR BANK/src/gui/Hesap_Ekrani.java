/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import veri_tabanı.veri_tabanı_bağlantısı;
import veri_tabanı.Veri_Tabanı_İşlemleri;
import java.sql.Connection;

/**
 *
 * @author emre_
 */
public class Hesap_Ekrani extends javax.swing.JFrame  {
        private Veri_Tabanı_İşlemleri veriTabaniIslem;
        

    /**
     * Creates new form Hesap_Ekrani
     */
    public Hesap_Ekrani(Veri_Tabanı_İşlemleri veriTabaniIslem)  {

   initComponents();
    this.veriTabaniIslem = veriTabaniIslem; 
    String isim = veriTabaniIslem.getAd_soyadi();
    this.setLocationRelativeTo(null);
    kullaniciAdSoyadLabel.setText(isim);
            Loglama_Sistem.log(">>> Ad Soyad: "+veriTabaniIslem.getAd_soyadi());

    String bakiye = Integer.toString(veriTabaniIslem.getBakiye());
    bakiyeLabel.setText(bakiye);
    veriTabaniIslem.ParaYönetimSistemi();
    int sayac=0; 
        }
   
   
     
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCek_icon = new javax.swing.JLabel();
        paraYatirButton = new javax.swing.JButton();
        paraCekButton = new javax.swing.JButton();
        paraYatir_icon = new javax.swing.JLabel();
        exit_label = new javax.swing.JLabel();
        money_label = new javax.swing.JLabel();
        para_yatir_text_label = new javax.swing.JLabel();
        para_çek_text_field = new javax.swing.JTextField();
        para_yatir_text_field = new javax.swing.JTextField();
        besTL_Label = new javax.swing.JTextField();
        onTL_Label = new javax.swing.JTextField();
        yirmiTL_Label = new javax.swing.JTextField();
        elliTL_Label = new javax.swing.JTextField();
        yüzTL_label = new javax.swing.JTextField();
        ikiyüzTL_label = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USKUDAR BANK HESAP EKRANI");

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 204));
        hesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                kullaniciAdSoyadLabelİnputMethodTextChanged(evt);
            }
        });
        hesapEkraniPanel.add(kullaniciAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 430, 50));

        bakiyeLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        hesapEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 30));

        paraCek_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/paracekmeicon.png"))); // NOI18N
        paraCek_icon.setText("jLabel1");
        hesapEkraniPanel.add(paraCek_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 102, -1));

        paraYatirButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 89, 39));

        paraCekButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraCekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 89, 39));

        paraYatir_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/icons8-safe-96.png"))); // NOI18N
        paraYatir_icon.setText("jLabel1");
        hesapEkraniPanel.add(paraYatir_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 100, 88));

        exit_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/exit_icon.png"))); // NOI18N
        exit_label.setText("Exit");
        exit_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(exit_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 120, -1));

        money_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/money.icon.png"))); // NOI18N
        money_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        money_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_labelMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(money_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 80, 60));
        hesapEkraniPanel.add(para_yatir_text_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        para_çek_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                para_çek_text_fieldActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(para_çek_text_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 40));

        para_yatir_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                para_yatir_text_fieldActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(para_yatir_text_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 90, 40));

        besTL_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besTL_LabelActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(besTL_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 70, -1));
        hesapEkraniPanel.add(onTL_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 70, -1));
        hesapEkraniPanel.add(yirmiTL_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 70, -1));
        hesapEkraniPanel.add(elliTL_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 70, -1));
        hesapEkraniPanel.add(yüzTL_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, -1));
        hesapEkraniPanel.add(ikiyüzTL_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 70, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("5TL");
        hesapEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("10TL");
        hesapEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("20 TL");
        hesapEkraniPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("50 TL");
        hesapEkraniPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("100 TL");
        hesapEkraniPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("200 TL");
        hesapEkraniPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
       String besTL_=besTL_Label.getText();
       String onTL_=onTL_Label.getText();
       String yirmiTL_=yirmiTL_Label.getText();
       String elliTL_=elliTL_Label.getText();
       String yüzTL_=yüzTL_label.getText();
       String ikiyüzTL_=ikiyüzTL_label.getText();
       
         veriTabaniIslem.ParaYönetimSistemi(); 

       besTL_ = besTL_.isEmpty() ? "0" : besTL_;
       onTL_ = onTL_.isEmpty() ? "0" : onTL_;
       yirmiTL_ = yirmiTL_.isEmpty() ? "0" : yirmiTL_;
       elliTL_ = elliTL_.isEmpty() ? "0" : elliTL_;
       yüzTL_ = yüzTL_.isEmpty() ? "0" : yüzTL_;
       ikiyüzTL_ = ikiyüzTL_.isEmpty() ? "0" : ikiyüzTL_;
      
       String withdrawAmountStr=para_yatir_text_field.getText();
       ////
       int besTL=Integer.parseInt(besTL_); 
       int onTL=Integer.parseInt(onTL_);
       int yirmiTL=Integer.parseInt(yirmiTL_);
       int elliTL=Integer.parseInt(elliTL_);
       int yüzTL=Integer.parseInt(yüzTL_);
       int ikiyüzTL=Integer.parseInt(ikiyüzTL_);
       int total=(besTL*5)+(onTL*10)+(yirmiTL*20)+(elliTL*50)+(yüzTL*100)+(ikiyüzTL*200);
       

    try {
        int withdrawAmount = Integer.parseInt(withdrawAmountStr); 

        if (withdrawAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Lutfen Miktar Girin!."); 
        }
        else  if(total<withdrawAmount)
        {
           
        JOptionPane.showMessageDialog(this,"Yatirmak Istediginiz Tutardan Eksik Para Yatirdiniz! \n Eklemeniz Gereken Tutar:"+(withdrawAmount-total)+"TL'dir.");
        Loglama_Sistem.log(">>> Musteri Yatirmak Istedigi Tutardan Eksik Para Yatirdi...");
        }
        else  if(total>withdrawAmount)
        {
        JOptionPane.showMessageDialog(this,"Yatirmak Istediginiz Tutardan Fazla Para Yatirdiniz! \n Geri ALmaniz Gereken Tutar:"+(withdrawAmount-total)+"TL'dir.");
                                           Loglama_Sistem.log(">>> Musteri Yatirmak Istedigi Tutardan Fazla Para Yatirdi...");
       
        }
        else if(besTL>10 || onTL>10 ||yirmiTL>10 || elliTL>10|| yüzTL>10 || ikiyüzTL>10)
        {
        JOptionPane.showMessageDialog(this,"Bir Banknot Türünden En fazla 10 tane yatirabilirsiniz !");
       
        }

       else if(besTL>0 && besTL+veriTabaniIslem.getBeşTL()>65)
        {
JOptionPane.showMessageDialog(this, "Sistem Su anda 5 TL'lik Kasete " + (65 - veriTabaniIslem.getBeşTL()) + " Adet Yatirmaniza Olanak Taniyor");
        }
       else  if(onTL>0 && onTL+veriTabaniIslem.getOnTL()>65)
        {
   JOptionPane.showMessageDialog(this, "Sistem Su anda 10 TL'lik Kasete " + (65 - veriTabaniIslem.getOnTL()) + " Adet Yatirmaniza Olanak Taniyor");

        }

       else  if(yirmiTL>0 &&yirmiTL+veriTabaniIslem.getYirmiTL()>65)
        {
JOptionPane.showMessageDialog(this, "Sistem Su anda 20 TL'lik Kasete " + (65 - veriTabaniIslem.getYirmiTL()) + " Adet Yatirmaniza Olanak Taniyor");
 }

       else  if(elliTL>0 && elliTL+veriTabaniIslem.getElliTL()>65)
        {
         JOptionPane.showMessageDialog(this, "Sistem Su anda 50 TL'lik Kasete " + (65 - veriTabaniIslem.getElliTL()) + " Adet Yatirmaniza Olanak Taniyor");
 }

       else  if(yüzTL>0 && yüzTL+veriTabaniIslem.getYüzTL()>65)
        {
JOptionPane.showMessageDialog(this, "Sistem Su anda 100 TL'lik Kasete " + (65 - veriTabaniIslem.getYüzTL()) + " Adet Yatirmaniza Olanak Taniyor");

 }

       else  if(ikiyüzTL>0 && ikiyüzTL+veriTabaniIslem.getIkiyüzTL()>65)
        {
JOptionPane.showMessageDialog(this, "Sistem Su anda 200 TL'lik Kasete " + (65 - veriTabaniIslem.getIkiyüzTL()) + " Adet Yatirmaniza Olanak Taniyor");

 }    
        
      
         else {
       int newBalance = veriTabaniIslem.getBakiye() + withdrawAmount;
           veriTabaniIslem.updateBalanceInDatabase2(newBalance);
           veriTabaniIslem.updatePara_Kasasi_Yatir(besTL,5);
           veriTabaniIslem.updatePara_Kasasi_Yatir(onTL,10);
           veriTabaniIslem.updatePara_Kasasi_Yatir(yirmiTL,20);
           veriTabaniIslem.updatePara_Kasasi_Yatir(elliTL,50);
           veriTabaniIslem.updatePara_Kasasi_Yatir(yüzTL,100);
           veriTabaniIslem.updatePara_Kasasi_Yatir(ikiyüzTL,200);


            bakiyeLabel.setText(String.valueOf(newBalance)); 
              
            JOptionPane.showMessageDialog(this, withdrawAmount + " TL Yatirildi."); 
        Loglama_Sistem.log(">>> Musteri Hesabina "+withdrawAmount+" TL' yatirdi."); 

        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçersiz Yatirma Miktarı.");
           Loglama_Sistem.log(">>> Musteri Gecersiz Bir Yatirma Miktari Girdi....");
    }
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
    String withdrawAmountStr = para_çek_text_field.getText(); 
    int bessayac=0;
    int onsayac=0;
    int yirmisayac=0;
    int ellisayac=0;
    int yüzsayac=0;
    int ikiyüzsayac=0;
       
    try {

        int withdrawAmount = Integer.parseInt(withdrawAmountStr);
                     Kalan_Para_Sistemi kalanpara1=new Kalan_Para_Sistemi(withdrawAmount);

        if (withdrawAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Lutfen Miktar Girin!.");
        } 
        else if (withdrawAmount > veriTabaniIslem.getBakiye()) {
            JOptionPane.showMessageDialog(this, "Yetersiz bakiye.");
             Loglama_Sistem.log(">>> Musterinin Bakiyesi Yeterisiz Oldugu Icin Para Cekme Islemi Gerceklesemedi....");

        } 
        else if(withdrawAmount%5==0) 
                    {
                     while(true)
                     {
                   
                     if(kalanpara1.getKalanpara()/385>=1)
                     {
                      if(veriTabaniIslem.getIkiyüzTL()>0)
                      {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,200);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-200);
                     ikiyüzsayac++;
                      }
                     if(veriTabaniIslem.getYüzTL()>0)
                      {
                     /////
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,100);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-100);
                     yüzsayac++;
                    /////
                      }
                      if(veriTabaniIslem.getElliTL()>0)
                      {
                      veriTabaniIslem.updateBalanceInDatabaseOther(1,50);
                      kalanpara1.setKalanpara(kalanpara1.getKalanpara()-50);
                      ellisayac++;
                     ////
                      }
                      if(veriTabaniIslem.getYirmiTL()>0)
                      {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,20);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-20);
                     yirmisayac++;
                     ////
                      }
                      if(veriTabaniIslem.getOnTL()>0)
                      {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,10);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-10);
                     onsayac++;
                      ///// 
                      }
                      if(veriTabaniIslem.getBeşTL()>0)
                      {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,5);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-5);
                     bessayac++;

                      }
                     continue;

                     }
                    
                     veriTabaniIslem.ParaYönetimSistemi();

                     if(kalanpara1.getKalanpara()>=200 && veriTabaniIslem.getIkiyüzTL()>0  )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,200);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-200);
                     ikiyüzsayac++;
                     continue;
                     }
                    veriTabaniIslem.ParaYönetimSistemi();

                    if(kalanpara1.getKalanpara()>=100  && veriTabaniIslem.getYüzTL()>0 )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,100);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-100);
                     yüzsayac++;
                     continue;
                     }
                     veriTabaniIslem.ParaYönetimSistemi();

                    if(kalanpara1.getKalanpara()>=50  && veriTabaniIslem.getElliTL()>0  )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,50);
                    kalanpara1.setKalanpara(kalanpara1.getKalanpara()-50);
                    ellisayac++;
                    continue;
                      }
                     veriTabaniIslem.ParaYönetimSistemi();

                    if(kalanpara1.getKalanpara()>=20  && veriTabaniIslem.getYirmiTL()>0 )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,20);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-20);
                     yirmisayac++;
                     continue;
                     }
                     veriTabaniIslem.ParaYönetimSistemi();

                    if(kalanpara1.getKalanpara()>=10 && veriTabaniIslem.getOnTL()>0 )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,10);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-10);
                     onsayac++;
                     continue;
                     }
                     veriTabaniIslem.ParaYönetimSistemi();

                     if(kalanpara1.getKalanpara()>=5 && veriTabaniIslem.getBeşTL()>0  )
                     {
                     veriTabaniIslem.updateBalanceInDatabaseOther(1,5);
                     kalanpara1.setKalanpara(kalanpara1.getKalanpara()-5);
                     bessayac++;
                     continue;
                     }
                     if(kalanpara1.getKalanpara()>0)
                     {
                     JOptionPane.showMessageDialog(this,"Bankamiz Su anda Istediginiz Miktar Icin "+ (withdrawAmount-kalanpara1.getKalanpara())+" TL Verebilmektedir....\n Lutfen Tekrar Bakiye Girin!");
                     veriTabaniIslem.updatePara_Kasasi_Yatir(bessayac,5);
                     veriTabaniIslem.updatePara_Kasasi_Yatir(onsayac,10);
                     veriTabaniIslem.updatePara_Kasasi_Yatir(yirmisayac,20);
                     veriTabaniIslem.updatePara_Kasasi_Yatir(ellisayac,50);
                     veriTabaniIslem.updatePara_Kasasi_Yatir(yüzsayac,100);
                     veriTabaniIslem.updatePara_Kasasi_Yatir(ikiyüzsayac,200);

                     break;
                     }
                     if(kalanpara1.getKalanpara()==0)
                     {
                     int newBalance = veriTabaniIslem.getBakiye() - withdrawAmount;
                   veriTabaniIslem.updateBalanceInDatabase(newBalance);
                   bakiyeLabel.setText(String.valueOf(newBalance));
                   Loglama_Sistem.log(">>> Musteri hesabindan "+withdrawAmount+" TL para cekti...");

                  JOptionPane.showMessageDialog(this, withdrawAmount + " TL çekildi."); 
                  break;
                     }
                     else
                     {
                     JOptionPane.showMessageDialog(this,"ATM'de Yeterli Para Yok. \nLutfen Baska Bir ATM'den Islem Yapin");
                     System.out.println("BesTL:"+veriTabaniIslem.getBeşTL());
                     break;
                     }
                     }
                     }
        else
        {
        JOptionPane.showMessageDialog(this,"Bankamiz Sadece 5 ve 5'in Katlarini Vermektedir.\nLutfen Tekrar Miktar Belirtiniz!");
                                           

        }
        
       
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçersiz çekme miktarı.");
                                           Loglama_Sistem.log(">>> Musteri Gecersiz Cekme Miktari Girdi...");

    }
       
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        dispose();
        JOptionPane.showMessageDialog(this,"İyi Gunler :)"+"\nUskudar Bank'a Tekrar Bekleriz");
       Loglama_Sistem.log(">>> Yukarida Musteri No'su yazan musterimiz sistemden cikis yapti....");
                 Loglama_Sistem.log("************************");
                                   Loglama_Sistem.log("");


        System.exit(0);
    }//GEN-LAST:event_exit_labelMouseClicked

    private void money_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_labelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_money_labelMouseClicked

    private void kullaniciAdSoyadLabelİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kullaniciAdSoyadLabelİnputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_kullaniciAdSoyadLabelİnputMethodTextChanged

    private void para_çek_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_para_çek_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_para_çek_text_fieldActionPerformed

    private void para_yatir_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_para_yatir_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_para_yatir_text_fieldActionPerformed

    private void besTL_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besTL_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_besTL_LabelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    Veri_Tabanı_İşlemleri veriTabaniIslem = new Veri_Tabanı_İşlemleri(); // Create an instance of Veri_Tabanı_İşlemleri
            


        /* Create and display the form */
         try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Hesap_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Hesap_Ekrani(veriTabaniIslem).setVisible(true); // Pass the veriTabaniIslem instance to the constructor
            
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JTextField besTL_Label;
    private javax.swing.JTextField elliTL_Label;
    private javax.swing.JLabel exit_label;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JTextField ikiyüzTL_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel money_label;
    private javax.swing.JTextField onTL_Label;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCek_icon;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JLabel paraYatir_icon;
    private javax.swing.JTextField para_yatir_text_field;
    private javax.swing.JLabel para_yatir_text_label;
    private javax.swing.JTextField para_çek_text_field;
    private javax.swing.JTextField yirmiTL_Label;
    private javax.swing.JTextField yüzTL_label;
    // End of variables declaration//GEN-END:variables

  
}
