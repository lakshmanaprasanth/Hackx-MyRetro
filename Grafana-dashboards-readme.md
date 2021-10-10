# Grafana dashboards:
Based on user data stored in DB we will be having personal account in Grafana for each user, the dashboards in Grafana will be showing progress of user in terms of problems solved across various sites such as hackerearth,hackerrank, leetcode with aggregationa across topics, difficulty level.

The link to access grafana is - http://3.110.43.132:3000/ and username password is viewer/viewer. The option to select values for variables will be available, but not edit option. 
In home page users will be seeing this - 
![image](https://user-images.githubusercontent.com/30981073/136684137-b3406cae-b712-4ddc-832e-b9894ac96b75.png)

From here they can move to 2, 3 and 4 numbered dashboards.
# Dashboard 2:
Contains the count number of problems solved and problems attempted (not yet solved) which will be grouped by difficulty level. In right side the single stat
panel will be denoting the number of problem solved till now and number of problem not yet solved.
![image](https://user-images.githubusercontent.com/30981073/136684265-79d3c53c-1ed1-4257-8102-6a1ce376899f.png)
![image](https://user-images.githubusercontent.com/30981073/136684314-d2658822-f878-4adc-a072-259c8fbe375f.png)


# Dashboard 3:
Contains the link of problems solved + attempted which is aggregated across all sites, across all topics, across all company for which those questions were asked.
![image](https://user-images.githubusercontent.com/30981073/136684334-7ead004e-e7de-4559-ae0d-962bee8c467f.png)


# Dashboard 4:
Contains the stats of number of problems solved and attempted aggregated across all sites, topics, company, and time duration ( which denotes past time interval from now)
Also clicking on each gauge will redirect to grafana dashboard 2 for time visualization for each attempted stats and solved stats.
![image](https://user-images.githubusercontent.com/30981073/136684393-80c56a83-4685-40e0-8903-a2788e552a44.png)
