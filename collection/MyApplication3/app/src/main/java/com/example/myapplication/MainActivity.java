public class MainActivity extends AppCompatActivity { Button closeButton;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        closeButton = (Button) findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {


            strings.xml
                    builder.setMessage(R.string.dialog_message)
                        .setTitle(R.string.dialog_title);


            builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) { finish();
                        Toast.makeText(getApplicationContext(),"you choose yes
                                action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"you choose no
                                action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                });

            AlertDialog alert = builder.create();

        }
    }
}
