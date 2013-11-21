<html>
    <head>
        <title>jetCore | Home</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ext-theme-neptune/ext-theme-neptune-all.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/ext/ext-all.js"></script>

        <style>
            #loginForm {
                position: relative;
                top:165px;
                left: 425px;
                width: 400px;
                height: 200px;

            }

            .field-margin {
                margin: 10px;
            }

        </style>
        <script>


            function displayMessage() {
                Ext.Msg.alert('Success', 'Form Submited');
            }
            Ext.require([
                'Ext.form.*',
                'Ext.tip.*',
                'Ext.layout.container.Column',
                'Ext.tab.Panel',
                'Ext.MessageBox'
            ]);

            Ext.onReady(function() {

                Ext.QuickTips.init();
                var loginPanel = Ext.create('Ext.form.Panel', {
                    frame: true,
                    title: 'jetCore App Login',
                    width: 400,
                    height: 200,
                    bodyPadding: 20,
                    defaultType: 'textField',
                    renderTo: Ext.get('loginForm'),
                    items: [
                        {
                            xtype: 'textfield',
                            fieldLabel: 'User Name',
                            name: 'userName',
                            size: 30,
                            allowBlank: false,
                            flex: 1,
                            cls: 'field-margin',
                            msgTarget: 'side'
                        },
                        {
                            xtype: 'textfield',
                            inputType: 'password',
                            fieldLabel: 'Password',
                            name: 'password',
                            size: 30,
                            allowBlank: false,
                            flex: 1,
                            cls: 'field-margin',
                            msgTarget: 'side'
                        }
                    ],
                    buttons: [
                        {
                            id: 'loginBtn',
                            text: 'Login',
                            handler: function() {
                                var myForm = this.up('form').getForm();
                                myForm.url = '${pageContext.request.contextPath}/login'


                                myForm.submit({
                                    success: function(myForm, action) {
                                        var data = JSON.parse(action.response.responseText);

                                        Ext.MessageBox.show({
                                            msg: 'Please wait...',
                                            progressText: 'Signing In...',
                                            wait: true,
                                            waitConfig: {interval: 200}
                                        });
                                        alert(data);
                                        //setTimeout(displayMessage, 2000);

                                    },
                                    failure: function(myForm, action) {
                                        //Ext.Msg.alert('Failed','Form Not Submited');
                                        alert(action.failureType);
                                    }
                                });

                            }
                        },
                        {
                            id: 'resetBtn',
                            text: 'Reset',
                            handler: function() {
                                this.up('form').getForm().reset();
                            }
                        }
                    ]

                });

            });


        </script>


    </head>
    <body>
        <div id="loginForm">

        </div>


    </body>
</html>