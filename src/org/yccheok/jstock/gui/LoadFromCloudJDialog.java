/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2010 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.services.oauth2.model.Userinfoplus;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.File;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.swing.Icon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.yccheok.jstock.gui.analysis.MemoryLogJDialog;
import org.yccheok.jstock.internationalization.GUIBundle;
import org.yccheok.jstock.internationalization.MessagesBundle;

/**
 *
 * @author yccheok
 */
public class LoadFromCloudJDialog extends javax.swing.JDialog {

    /** Creates new form LoadFromCloudJDialog */
    public LoadFromCloudJDialog(java.awt.Frame parent, boolean modal, Pair<Credential, Userinfoplus> pair) {
        super(parent, modal);
        initComponents();
        this.pair = pair;
        this.jLabel1.setText(pair.second.getEmail());
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        setTitle(bundle.getString("LoadFromCloudJDialog_Title")); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));
        getContentPane().add(jPanel6, java.awt.BorderLayout.WEST);
        getContentPane().add(jPanel5, java.awt.BorderLayout.EAST);

        jXHeader1.setDescription(bundle.getString("LoadFromCloudJDialog_Description")); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/download_from_cloud.png"))); // NOI18N
        jXHeader1.setTitle(bundle.getString("LoadFromCloudJDialog_Title")); // NOI18N
        getContentPane().add(jXHeader1, java.awt.BorderLayout.NORTH);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/apply.png"))); // NOI18N
        jButton1.setText(bundle.getString("LoadFromCloudJDialog_OK")); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/button_cancel.png"))); // NOI18N
        jButton2.setText(bundle.getString("LoadFromCloudJDialog_Cancel")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(bundle.getString("LoadFromCloudJDialog_WarningAllYourDataWillBeOverwriteByCloudData")); // NOI18N
        jPanel4.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/spinner.gif"))); // NOI18N
        jPanel4.add(jLabel4);

        jLabel5.setText(bundle.getString("WizardDownloadlIndicatorJPanel_ViewLog")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel4.add(jLabel5);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LoadFromCloudJDialog_GoogleAccount"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(140, 196, 116));
        jLabel1.setFont(getRobotoLightFont());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("username@email.com");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);

        jButton3.setText(bundle.getString("LoadFromCloudJDialog_SignOut")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(420, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cancel();
    }//GEN-LAST:event_formWindowClosed

    private void cancel() {
        if (loadFromCloudTask != null) {
            loadFromCloudTask.cancel(true);
            loadFromCloudTask = null;
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        MemoryLogJDialog memoryLogJDialog = new MemoryLogJDialog(MainFrame.getInstance(), true);
        memoryLogJDialog.setLocationRelativeTo(this);
        memoryLogJDialog.setLog(memoryLog);
        memoryLogJDialog.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jButton1.setEnabled(false);

        // Update GUI immediately. So that user will not feel our app is slow.
        jLabel3.setText(GUIBundle.getString("LoadFromCloudJDialog_LoadingFromCloud..."));
        jLabel4.setIcon(Icons.BUSY);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);

        this.loadFromCloudTask = this.getLoadFromCloudTask("");
        this.loadFromCloudTask.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        org.yccheok.jstock.google.Utils.logoutDrive();
        
        this.setVisible(false);
        this.dispose();
        
        MainFrame.getInstance().loadFromCloud();
    }//GEN-LAST:event_jButton3ActionPerformed

    private static class Status {
        public final String message;
        public final Icon icon;
        private Status(String message, Icon icon) {
            if (message == null || icon == null) {
                throw new IllegalArgumentException("Method arguments cannot be null");
            }
            this.message = message;
            this.icon = icon;
        }
        public static Status newInstance(String message, Icon icon) {
            return new Status(message, icon);
        }
    }
    
    private SwingWorker<Boolean, Status> getLoadFromCloudTask(final String username) {
        SwingWorker<Boolean, Status> worker = new SwingWorker<Boolean, Status>() {
            @Override
            protected void done() {
                boolean result = false;

                // Some developers suggest to catch this exception, instead of
                // checking on isCancelled. As I am not confident by merely
                // isCancelled check can prevent CancellationException (What
                // if cancellation is happen just after isCancelled check?),
                // I will apply both techniques.
                if (this.isCancelled() == false) {
                    try {
                        result = this.get();
                    } catch (InterruptedException ex) {
                        log.error(null, ex);
                    } catch (ExecutionException ex) {
                        log.error(null, ex);
                    } catch (CancellationException ex) {
                        log.error(null, ex);
                    }
                }

                jButton1.setEnabled(true);

                if (result == true) {
                    JOptionPane.showMessageDialog(LoadFromCloudJDialog.this, GUIBundle.getString("LoadFromCloudJDialog_Success"));
                    setVisible(false);
                    dispose();
                }
            }

            @Override
            protected void process(java.util.List<Status> statuses) {
                for (Status status : statuses) {
                    writeToMemoryLog(status.message);
                    jLabel3.setText(status.message);
                    jLabel4.setIcon(status.icon);
                    jLabel3.setVisible(true);
                    jLabel4.setVisible(true);
                    if (status.icon == Icons.ERROR || status.icon == Icons.WARNING) {
                        jLabel3.setForeground(Color.RED);
                        jLabel5.setVisible(true);
                    }
                    else
                    {
                        jLabel3.setForeground(Color.BLUE);
                        jLabel5.setVisible(false);
                    }
                }
            }

            @Override
            protected Boolean doInBackground() {
                if (isCancelled()) {
                    return false;
                }

                memoryLog.clear();

                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_LoadingFromCloud..."), Icons.BUSY));

                Utils.CloudFile cloudFile = Utils.loadFromGoogleDoc(username, "");
                if (cloudFile == null) {
                    // Perhaps we should load from legacy cloud server, and help
                    // user to perform migration to Google Doc server.
                    cloudFile = Utils.loadFromCloud(username, "");
                    if (cloudFile == null) {                        
                        publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_LoadingFromCloudFail"), Icons.ERROR));
                        return false;
                    } else {
                        if (false == Utils.saveToGoogleDoc(username, "", cloudFile.file)) {
                            // Migration fail.
                            LoadFromCloudJDialog.this.showMessageBoxWithGoogleDocLink();
                            
                        } else {
                            // Migration success.
                            JOptionPane.showMessageDialog(LoadFromCloudJDialog.this, 
                                    MessagesBundle.getString("info_message_migration_to_google_doc_server_success"), 
                                    MessagesBundle.getString("info_title_migration_to_google_doc_server_success"), 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                /* Check for checksum. */
                if (cloudFile.checksum != org.yccheok.jstock.analysis.Utils.getChecksum(cloudFile.file)) {
                    publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_CheckingCheckSumFail"), Icons.ERROR));
                    return false;
                }
                /* Check for date. */
                final long today = new Date().getTime();
                final long milli_seconds_in_a_day = 1000 * 24 * 60 * 60;
                if ((today / milli_seconds_in_a_day) != (cloudFile.date / milli_seconds_in_a_day)) {
                    DateFormat dateFormat = DateFormat.getDateInstance();
                    final String message = MessageFormat.format(MessagesBundle.getString("question_message_overwrite_your_data_by_cloud_data_at_template"), dateFormat.format(cloudFile.date));
                    final int result = JOptionPane.showConfirmDialog(LoadFromCloudJDialog.this, message, MessagesBundle.getString("question_title_overwrite_your_data_by_cloud_data_at"), JOptionPane.YES_NO_OPTION);
                    if (result != JOptionPane.YES_OPTION) {
                        publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_UserRefuseToOverwriteWithOldData"), Icons.ERROR));
                        return false;
                    }
                }
                /* Check for version. */
                if (Utils.isCloudFileCompatible(cloudFile.version) == false) {
                    final String message = MessageFormat.format(GUIBundle.getString("LoadFromCloudJDialog_VersionNotCompatible_template"), cloudFile.version);
                    publish(Status.newInstance(message, Icons.ERROR));
                    return false;
                }

                // Place isCancelled check after time consuming operation.
                // Not the best way, but perhaps the easiest way to cancel
                // the operation.
                if (isCancelled()) {
                    return false;
                }

                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_ExtractingData..."), Icons.BUSY));
                boolean status = Utils.extractZipFile(cloudFile.file, true);
                
                // Place isCancelled check after time consuming operation.
                // Not the best way, but perhaps the easiest way to cancel
                // the operation.
                if (isCancelled()) {
                    return false;
                }
                
                if (false == status) {
                    publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_ExtractingDataFail"), Icons.ERROR));
                }

                final File f = new File(org.yccheok.jstock.gui.Utils.getUserDataDirectory() + "config" + File.separator + "options.xml");
                final JStockOptions jStockOptions = Utils.fromXML(JStockOptions.class, f);
                if (jStockOptions != null) {
                    MainFrame.getInstance().getJStockOptions().insensitiveCopy(jStockOptions);
                }

                MainFrame.getInstance().reloadAfterDownloadFromCloud();

                publish(Status.newInstance(GUIBundle.getString("LoadFromCloudJDialog_Success"), Icons.OK));

                return status;
            }
        };
        return worker;
    }

    private void writeToMemoryLog(String message) {
        // http://www.leepoint.net/notes-java/io/10file/sys-indep-newline.html
        // public static String newline = System.getProperty("line.separator");
        // When NOT to use the system independent newline characters
        // JTextArea lines should be separated by a single '\n' character, not the sequence that is used for file line separators in the operating system.
        // Console output (eg, System.out.println()), works fine with '\n', even on Windows.
        final DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
        final String s = dateFormat.format(new Date()) + "\n" + message;
        this.memoryLog.add(s);
    }

    private Font getRobotoLightFont() {
        return Utils.getRobotoLightFont().deriveFont((float)18);
    }
    
    private void showMessageBoxWithGoogleDocLink() {
        // for copying style
        JLabel label = new JLabel();
        Font font = label.getFont();

        // create some css from the label's font
        StringBuilder style = new StringBuilder("font-family:" + font.getFamily() + ";");
        style.append("font-weight:").append(font.isBold() ? "bold" : "normal").append(";");
        style.append("font-size:").append(font.getSize()).append("pt;");

        // html content
        String html = MessageFormat.format(MessagesBundle.getString("info_message_register_google_doc"), style);
        JEditorPane ep = new JEditorPane("text/html", html);

        // handle link events
        ep.addHyperlinkListener(new HyperlinkListener()
        {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e)
            {
                Utils.launchWebBrowser(e);
            }
        });
        ep.setEditable(false);
        ep.setBackground(label.getBackground());

        // show
        JOptionPane.showMessageDialog(null, ep, MessagesBundle.getString("info_title_register_google_doc"), JOptionPane.INFORMATION_MESSAGE);        
    }
    
    private final Pair<Credential, Userinfoplus> pair;
    
    private volatile SwingWorker<Boolean, Status> loadFromCloudTask = null;
    private final List<String> memoryLog = new ArrayList<String>();
    
    private static final Log log = LogFactory.getLog(LoadFromCloudJDialog.class);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables

}
