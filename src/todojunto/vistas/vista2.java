//package todojunto.vistas;
//
//public class vista2 {
//    //esta vista es la encargada de renderizar la tabla principal
//
//    private void initComponents() {
//
//        //instancia los componentes de la ventana
//        jScrollPane1 = new javax.swing.JScrollPane();
//        TablaAlumnos = new javax.swing.JTable();
//        jPanel1 = new javax.swing.JPanel();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        txtDni = new javax.swing.JTextField();
//        txtRegistro = new javax.swing.JTextField();
//        jLabel3 = new javax.swing.JLabel();
//        txtNombre = new javax.swing.JTextField();
//        jLabel4 = new javax.swing.JLabel();
//        txtApellido1 = new javax.swing.JTextField();
//        jLabel5 = new javax.swing.JLabel();
//        txtApellido2 = new javax.swing.JTextField();
//        jPanel2 = new javax.swing.JPanel();
//        btnAltas = new javax.swing.JButton();
//        btnBajas = new javax.swing.JButton();
//        btnModificaciones = new javax.swing.JButton();
//        btnSalir = new javax.swing.JButton();
//        jLabel6 = new javax.swing.JLabel();
//
//
//        //establece el comportamiento de la ventana una vez se cierra
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//
//        //inicializa los elementos para su posterior creacion
//        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//
//                },
//                new String [] {
//
//                }
//        ));
//        //aniade un oyente para que se desencandene una accion
//        TablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                TablaAlumnosMouseClicked(evt);
//            }
//        });
//
//        jScrollPane1.setViewportView(TablaAlumnos);
//
//        jLabel1.setText("Dni");
//
//        jLabel2.setText("Registro");
//
//        jLabel3.setText("Nombre");
//
//        txtNombre.setToolTipText("");
//
//        jLabel4.setText("Apellido1");
//
//        jLabel5.setText("Apellido2");
//
//        //agrega los elementos al panel, primero instancia un nuevo objeto, luego indica el layout, por ultimmo aniade los componentes
//        //al parecer el grupo layout tiene 2 compnentes que hay que configurar -- horizontal and vertical
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//
//        //parte horizontal
//        jPanel1Layout.setHorizontalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                        .addComponent(jLabel1)
//                                        .addComponent(jLabel2)
//                                        .addComponent(txtDni)
//                                        .addComponent(txtRegistro)
//                                        .addComponent(jLabel3)
//                                        .addComponent(txtNombre)
//                                        .addComponent(jLabel4)
//                                        .addComponent(txtApellido1)
//                                        .addComponent(jLabel5)
//                                        .addComponent(txtApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
//                                .addContainerGap(80, Short.MAX_VALUE))
//        );
//        //parate vertical
//        jPanel1Layout.setVerticalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGap(21, 21, 21)
//                                .addComponent(jLabel1)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel2)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel3)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel4)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel5)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
//                                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap())
//        );
//
//
//        //se modifica el boton de altas y se la aniade un oyente
//        btnAltas.setText("Altas");
//        btnAltas.setMaximumSize(new java.awt.Dimension(90, 25));
//        btnAltas.setMinimumSize(new java.awt.Dimension(90, 25));
//        btnAltas.setPreferredSize(new java.awt.Dimension(99, 25));
//        btnAltas.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnAltasBotonesClick(evt);
//            }
//        });
//
//        btnBajas.setText("Bajas");
//        btnBajas.setMinimumSize(new java.awt.Dimension(90, 25));
//        btnBajas.setPreferredSize(new java.awt.Dimension(70, 25));
//        btnBajas.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnBajasActionPerformed(evt);
//            }
//        });
//
//        btnModificaciones.setText("Modificar");
//        btnModificaciones.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnModificacionesActionPerformed(evt);
//            }
//        });
//
//        btnSalir.setText("Salir");
//        btnSalir.setMaximumSize(new java.awt.Dimension(90, 25));
//        btnSalir.setMinimumSize(new java.awt.Dimension(90, 25));
//        btnSalir.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnSalirActionPerformed(evt);
//            }
//        });
//
//        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png"))); // NOI18N
//
//
//        //este panel es donde estan alojados los botones
//        //todo refactorizar nombre de las variables y ver que
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
//                                        .addGroup(jPanel2Layout.createSequentialGroup()
//                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                                        .addComponent(btnAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                        .addComponent(btnModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                                                .addGap(35, 35, 35)
//                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                                        .addComponent(btnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
//                                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//                                .addGap(24, 24, 24))
//        );
//        jPanel2Layout.setVerticalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel2Layout.createSequentialGroup()
//                                .addGap(46, 46, 46)
//                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(btnAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(btnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(18, 18, 18)
//                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(btnModificaciones)
//                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap(34, Short.MAX_VALUE))
//        );
//
//        //en este panel es donde se incrustan los otros paneles
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                .addGap(82, 82, 82)
//                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(26, 26, 26)
//                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addGap(94, 94, 94))
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(118, 118, 118)
//                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap(188, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addContainerGap()
//                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                                .addContainerGap())
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//}
