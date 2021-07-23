import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rolesallowed")
public class ReadOnlyRestServiceRolesAllowed {

    @GET
    @RolesAllowed("USER")
    public Response browse() {
        return Response.ok().build();
    }

    @GET
    @RolesAllowed("USER")
    public Response read() {
        return Response.ok().build();
    }

    @POST
    @DenyAll
    public Response add() {
        return Response.ok().build();
    }

    @POST
    @DenyAll
    public Response edit() {
        return Response.ok().build();
    }

    @DELETE
    @DenyAll
    public Response delete() {
        return Response.ok().build();
    }

}
