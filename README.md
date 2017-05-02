# JSF, Java Server Faces
Exempel.
## Enkel struktur
 Med bla WEB-INF/web.xml och pom.xml
 
## Stegvis förfining
Utvecklingen av repot sker vi stegvis förfining där varje steg är taggat.
* Steg 1 heter step1<br/>
Som bara innehåller struktur + index-html
* Nästa steg step2 med enkelt böna
* osv

För att se alla steg/taggar kan något av kommandona:
<pre>
git tag -n
git log --tags --simplify-by-decoration --pretty="format:%ai %d"
</pre>
användas. Det senare med tidsstämplar och sortering i omvänd kronologisk ordning

# Observera
## @ManagedProperty
I ett av stegen var vi tvugna att byta ut @Named-annoteringar mot @ManagedBean-annoteringar.<br />
För annars fungerar inte @ManagedProperty-annoteringar!

## För att få @Named och @Inject att fungera
Behöver man en fil **beans.xml** i **WEB-INF**-katalogen. Denna fil kan vara tom.<br />
Detta gäller i alla fall för JBoss.