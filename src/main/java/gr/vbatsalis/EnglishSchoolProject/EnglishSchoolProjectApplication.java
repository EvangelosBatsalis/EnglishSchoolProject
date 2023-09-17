package gr.vbatsalis.EnglishSchoolProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnglishSchoolProjectApplication /*extends Application*/ {

	public static void main(String[] args) {
//		launch(args);
		SpringApplication.run(EnglishSchoolProjectApplication.class, args);
	}
/*
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(
				EnglishSchoolProjectApplication.class.getResource("/SearchController.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
		Scene scene = new Scene(page);

		stage.setTitle("Title goes here");
		stage.setScene(scene);
		stage.show();
	}
 */
}

