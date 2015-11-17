{{template "_head.gtpl"}}
<!--end mainHeader -->
{{if .}}
<a href="/delete/all">
  <button class="btn-danger btn glyphicon glyphicon-trash floating-action-icon"></button>
</a>
{{end}}

<!-- Add note modal -->
<div class="modal fade " id="addNoteModal" tabindex="-1" role="dialog" aria-labelledby="newNoteLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="newNoteLabel"><span class="glyphicon glyphicon-pencil"></span>  New Task</h4>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <!-- <label for="note-title" class="control-label">Title:</label> -->
            <input type="text" class="form-control" id="add-note-title" placeholder="Title" style="border:none;border-bottom:1px solid gray; box-shadow:none;">
          </div>
          <div class="form-group">
            <!-- <label for="note-content" class="control-label">Content:</label> -->
            <textarea class="form-control" id="add-note-content" placeholder="Content" rows="10" style="border:none;border-bottom:1px solid gray; box-shadow:none;"></textarea>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" id="addNoteModalSaveBtn">Save</button>
      </div>
    </div>
  </div>
</div>

<!-- modal for opening note -->
<div class="modal fade" id="openNoteModal" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button class="close" data-dismiss="modal"> &times;</button>
        <h4 class="modal-title"></h4>
      </div>
      <div class="modal-body">

      </div>
    </div>
  </div>
</div>

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
    </li>
    <li role="presentation">
      <a role="menuitem" tabindex="-1" href="/archive/{{.Id}}">
        <span class="glyphicon glyphicon-inbox"></span> Edit</a>
    </li>!-->
    <li role="presentation">
      <a role="menuitem" tabindex="-1" href="/delete/{{.Id}}">
        <span class="glyphicon glyphicon-trash"></span> Delete</a>
    </li>
    <li role="presentation">
      <a role="menuitem" tabindex="-1" href="/restore/{{.Id}}">
        <span class="glyphicon glyphicon-inbox"></span> Restore</a>
    </li>
    </ul>
    </span>
  </div>
  {{end}} {{else}}
  <p>No tasks here</p>
  {{end}}
</div>
{{template "footer.gtpl"}}

</body>

</html>
