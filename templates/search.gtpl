{{template "_head.gtpl"}}
  <!--end mainHeader -->
  <button class=" btn-danger btn glyphicon glyphicon-plus floating-action-icon floating-action-icon-add"></button>


  <div class="timeline">
    {{ if .}} {{range .}}
    <div class="note">
      <p class="noteHeading">{{.Title}}</p>
      <hr>
      <p class="noteContent">{{.Content}}</p>
      <span class="notefooter">
                    <ul class="menu">
                     <!-- <li role="presentation">
                          <a role="menuitem" tabindex="-1" href="/share/{{.Id}}">
                          <span class="glyphicon glyphicon-share"></span> Share</a>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/mask/{{.Id}}">
          <span class="glyphicon glyphicon-lock"></span> Mask</a>
      </li> !-->
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/edit/{{.Id}}">
          <span class="glyphicon glyphicon-pencil"></span> Edit</a>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/archive/{{.Id}}">
          <span class="glyphicon glyphicon-inbox"></span> Complete</a>
      </li>
      <!--
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="/delete/{{.Id}}">
                           <span class="glyphicon glyphicon-trash"></span>  Delete</a></li>
-->
      </ul>
      </span>
    </div>
    {{end}} {{else}}
    <p>No match found</p>
    {{end}}
  </div>
  {{template "_footer.gtpl"}}


</body>

</html>
