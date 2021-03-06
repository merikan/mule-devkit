<?cs set:section = "guide" ?>
<?cs include:"doctype.cs" ?>
<?cs include:"macros.cs" ?>
<html>
<?cs include:"head_tag.cs" ?>
<body class="gc-documentation">
<?cs call:custom_masthead() ?>
<div class="g-section g-tpl-240" id="body-content">
    <div class="g-unit g-first side-nav-resizable" id="side-nav">
      <div id="devdoc-nav"><ul>
    <?cs each:topic = topics ?>
  <li>
    <h2><span class="en"><?cs var:topic.title ?></span></h2>
        <?cs each:subtopic = topic.topics ?>
        <li class="toggle-list"><div>
           <a href="<?cs var:subtopic.link ?>"><span class="en"><?cs var:subtopic.title ?></span></a></div>
         <ul id="devdoc-nav-article-list">
         </ul>
         </li>
        <?cs /each ?>
  </li>
    <?cs /each ?>
 </ul> </div> <!-- devdoc-nav -->
  </div>
 </div>

<div class="g-unit" id="doc-content"><a name="top"></a>

<div id="jd-header" class="guide-header">
  <span class="crumb">
    <?cs if:parent.link ?>
      <a href="<?cs var:parent.link ?>"><?cs var:parent.title ?></a> >
    <?cs else ?>&nbsp;
    <?cs /if ?>
  </span>
<h1><?cs var:page.title ?></h1>
</div>

  <div id="jd-content">

    <div class="jd-descr">
    <?cs call:tag_list(root.descr) ?>
    </div>

  <a href="#top" style="float:right">&uarr; Go to top</a>
  <?cs if:parent.link ?>
    <p><a href="<?cs var:parent.link ?>">&larr; Back to <?cs var:parent.title ?></a></p>
  <?cs /if ?>
  </div>

<?cs include:"footer.cs" ?>
</div><!-- end doc-content -->

<?cs include:"trailer.cs" ?>

</body>
</html>



