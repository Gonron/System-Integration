# SI-MP2
[Assignment](https://github.com/CBASoftwareDevolopment2020/SI-MP2/edit/main/README.md)

| Name                     | Tag       |
| ------------------------ | --------- |
| Daniel Lindholm          | cph-dl110 |
| Jacob Borg               | cph-jb308 |
| Michael Ejdal Lundsgaard | cph-ml510 |
| Nikolaj Thorsen Nielsen  | cph-nn134 |

We've created this project to demonstrate how a service would validate emails. There's two different ServiceTasks, that automaticly can accept or reject an email, based on different values, e.g. if the email contains some unacceptable words, from a denylist.

Should it happen that an email gets rejected by one of these services it will be redirected to a UserTask, where it will have to be manually reviwed.

If the email makes it through all of our validation, it will be printed and saved in a "mails" folder.

![](https://raw.githubusercontent.com/CBASoftwareDevolopment2020/SI-MP2/main/mail.png)
