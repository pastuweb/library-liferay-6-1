Liferay.Service.register("Liferay.Service.APITlm", "com.telecomlab.apitlm.service", "APITlmDB-portlet");

Liferay.Service.register("Liferay.Service.APINH", "com.telecomlab.provisioning.service", "TelecomProvisioning-portlet");

Liferay.Service.register("Liferay.Service.AV", "com.appuntivari.mylibrary.service", "Library-portlet");

Liferay.Service.registerClass(
	Liferay.Service.AV, "MyLibrary",
	{
		addBook_Fake: true,
		getAllBooks: true
	}
);